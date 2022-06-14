package day_10.Sub_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfAllSunbArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(
            Arrays.asList(1, 2, 3)
        );

        System.out.println(subarraySum(A));
    }

    public static Long subarraySum(ArrayList<Integer> A) {
        int n = A.size();
        Long totalSum = 0L;

        for(int i = 0; i < n; i++) {
           totalSum  += A.get(i) * (n-i) * (i+1); 
        }

        return totalSum;
    }
}
