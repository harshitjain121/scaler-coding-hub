package day_10.Sub_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//KADANE'S ALGORITHM 
public class MaxSumContiguousSubarray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, -10)
        );

        System.out.println(maxSubArray(A));
    }

    public static int maxSubArray(final List<Integer> A) {
        return kadanesAlgo(A);
    }

    public static int kadanesAlgo(List<Integer> A){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < A.size(); i++) {
            currSum += A.get(i);

            if(currSum > maxSum)
                maxSum = currSum;
            
            if(currSum < 0)
                currSum = 0;
        }

        return maxSum;
    }
}
