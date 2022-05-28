package day_4.assignment;


import java.lang.*;
import java.util.*;

public class PerfectNumber {
    
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        // taking input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            int sum = -num;
            // System.out.println("Initialised sum : "+sum);
            for(int j=1 ; j*j <= num; j++){
                if(num % j == 0){
                    if(j == num/j){
                        sum += j;
                        // continue;
                    }
                    else{
                        sum += j + (num/j);
                    }
                }
                // System.out.println("sum : "+sum);
            }
            if(sum == num){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}