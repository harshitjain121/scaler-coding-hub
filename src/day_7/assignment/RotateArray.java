package day_7.assignment;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        if(B>n) B = B%n;

        arr = reverse(arr, 0, n-1);
        arr = reverse(arr, 0, B-1);
        arr = reverse(arr, B, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }

    }

    public static int[] reverse(int[] arr, int s, int e){
        int i = s;
        int j = e;
        while(i<=j){
            arr = swap(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    public static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    } 
}
