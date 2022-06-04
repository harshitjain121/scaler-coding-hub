package day_8.Array_Prefix_Sum;

import java.util.ArrayList;
import java.util.Arrays;

public class GooglePrefixSum {
    // Count ways to make sum of odd and even indexed elements equal by removing an array element

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(
            Arrays.asList(1, 1, 1)
        );
        
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        int[] pFEvenSum = new int[A.size()];
        int[] pFOddSum = new int[A.size()];
        // System.out.println(A);
        pFEvenSum = calPFEvenSum(pFEvenSum, A);
        pFOddSum = calPFOddSum(pFOddSum, A);
        return equilibriumCount(pFEvenSum, pFOddSum, A, 0);
    }

    public static int[] calPFEvenSum(int[] pFEvenSum, ArrayList<Integer> A){
        pFEvenSum[0] = A.get(0);
        // System.out.print(pFEvenSum[0] + "  ");
        for(int i=1; i<A.size(); i++){
            if(i%2 == 1){
                pFEvenSum[i] = pFEvenSum[i-1];
                // System.out.print(pFEvenSum[i] + "  ");
            }
            else{
                pFEvenSum[i] = pFEvenSum[i-1] + A.get(i);
                // System.out.print(pFEvenSum[i] + "  ");
            }
        }
        // System.out.println();
        return pFEvenSum;
    }

    public static int[] calPFOddSum(int[] pFOddSum, ArrayList<Integer> A){
        // pFOddSum[0] = A.get(0);
        pFOddSum[0] = 0; // as zero is even
        // System.out.print(pFOddSum[0] + "  ");
        for(int i=1; i<A.size(); i++){
            if(i%2 == 0){
                pFOddSum[i] = pFOddSum[i-1];
                // System.out.print(pFOddSum[i] + "  ");
            }
            else{
                pFOddSum[i] = pFOddSum[i-1] + A.get(i);
                // System.out.print(pFOddSum[i] + "  ");
            }
        }
        // System.out.println();
        return pFOddSum;
    }


    private static int equilibriumCount(int[] pFEvenSum, int[] pFOddSum, ArrayList<Integer> A, int count) {
        int n = A.size();
        for (int i = 0; i < n; i++) {
            if(i==0){
                if((pFOddSum[n-1] - pFOddSum[i]) == (pFEvenSum[n-1] - pFEvenSum[i])){
                    count++ ;
                }
                continue;
            }
            // even sum = sumEven[0, i-1] + sumOdd[i+1, n-1]
            int totalEven = pFEvenSum[i-1] + (pFOddSum[n-1] - pFOddSum[i]);
            int totalOdd = pFOddSum[i-1] + (pFEvenSum[n-1] - pFEvenSum[i]);
            
            if(totalEven == totalOdd){
                count++ ;
                // System.out.println(i);
            }
        }
        return count;
    }
}
