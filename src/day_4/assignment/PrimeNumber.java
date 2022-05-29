package day_4.assignment;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        // taking input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // corner case
        if(n == 1 || n%2 ==0){
            System.out.println("NO");
            return;
        }
        // corner case
        if(n == 2){
            System.out.println("YES");
            return;
        }
        for (int i=3; i*i <= n; i+=2) {
            if(n%i == 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}