package day_4.assignment;


import java.util.*;

// binary search
public class PerfectSquareRoot {
    public static void main(String[] args) {
        System.out.println("ans : " + binarySearch(1065024));
    }
    
    public int solve(int A) {
        return binarySearch(A);
    }

    public static int binarySearch(int k){
        int s = 1;
        int e = k;
        long mid = s + (e-s)/2;

        while(s<=e){
            System.out.println(s+ " <- "+mid+" -> " + e);
            if(mid*mid == k){
                return (int) mid;
            }
            else if(mid*mid > k){
                // move left
                e = (int) (mid - 1);
            }
            else{
                // move right
                s = (int) (mid + 1);
            }
            mid = s + (e-s)/2;
        }
        return -1;
    }

}