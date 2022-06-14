package day_10.Sub_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayWithLeastAverage {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(
            Arrays.asList(3, 7, 5, 20, -10, 0, 12)
        );
        System.out.println(solve(A, 2));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int index = 0;
        //sum of first subarray with B elements
        for (int i = 0; i < B; i++) {
            sum += A.get(i);
        }
        min = sum;
        for (int i = B; i < A.size(); i++) {
            sum += A.get(i) - A.get(i-B);

            if(min> sum){
                min = sum;
                index = i-B+1;
            }
        }
        return index;
    }
}
