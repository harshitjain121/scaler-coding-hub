package day_7.assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SearchElement {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            Set<Integer> set = new HashSet<Integer>(); 
            for(int i=0; i<n; i++){
                set.add(sc.nextInt());
            }
            int B = sc.nextInt();
            if(set.contains(B))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
