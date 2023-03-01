package day_24.Recursion;

public class ReverseStringLC {
    public static void main(String[] args) {
        char[] str = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverse(str, 0, 4);
    }

    // public static void reverseString(char[] s) {
    //     reverse(s, 0, s.length-1);
    // }
    
    public static char[] reverse(char[] str, int s, int e){
        System.out.println(s +"  -  "+ e);
        //base case
        if(s >= e)  return str;
        
        //process - swaping
        char temp = str[s];
        str[s] = str[e];
        str[e] = temp;
        
        //recursive call
        return reverse(str, ++s, --e);
    }
}
