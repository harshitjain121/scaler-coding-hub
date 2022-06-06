package day_9.Arrays_Carry_forward;

public class SpecialSubsequence {
    public static void main(String[] args) {
        String A = "ABCGPQAGG";
        //find sub sequence AG
        System.out.println(solve(A));
    }

    public static int solve(String A) {
        //start from end - carry forward technique
        int subSequence = 0;
        int count_G = 0;
        for(int i=A.length()-1 ; i>=0; i-- ){
            if(A.charAt(i) == 'G')
                count_G++;
            if(A.charAt(i) == 'A')
                subSequence += count_G;
        }
        return subSequence;
    }
}
