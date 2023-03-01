package day_24.Recursion;

public class MagicNumber {
    public static void main(String[] args) {
        solve(83557);
    }

    public static int solve(int A) {
        System.out.println("call : "+ A);
        //base case
        if(A<10)    return A;
        
        //recursive call
        return A%10 + solve(A/10);
    }
}
