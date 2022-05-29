package day_7.assignment;

import java.util.Scanner;

public class MaxMinOfArray {
    
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] arr = new int[N];
        for(int i=0; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("length : " +arr.length);
        // int current;
        // for(int i=1; i<=N ; i++){
        //     current = sc.nextInt();
        //     min = Math.min(min, current);
        //     max = Math.max(min, current);
        // }

        System.out.println(max + " " + min);


        for(int i=0; i<1000 ; i++){
            System.out.print(i + " ");
        }
        
    }
}
