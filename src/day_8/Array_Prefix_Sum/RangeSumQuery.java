package day_8.Array_Prefix_Sum;

import java.util.ArrayList;
import java.util.Arrays;

public class RangeSumQuery {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(
                Arrays.asList(7, 3, 1, 5, 5, 5, 1, 2, 4, 5));

        System.out.println(rangeSum(A));
    }

        public static int rangeSum(ArrayList<Integer> A) {
            int[] pfSum = new int[A.size()+1];
            pfSum = calculatePrefixArray(pfSum, A);
            int L = 7;
            int R = 10;
            int  ans = pfSum[R] - pfSum[L-1];

            return ans;
        }
    
        // 1 based index
        public static int[] calculatePrefixArray(int[] pfSum, ArrayList<Integer> A){
            pfSum[0] = 0;
            for(int i=1; i<=A.size(); i++){
                pfSum[i] = pfSum[i-1] + A.get(i-1);
                System.out.print(pfSum[i] + " ");
            }
            System.out.println();
            return pfSum;
        }
    
    
    //0 1 2 3   4 - index
    
    //1 2 3 4   5
    //1 3 6 10  15
    
}
