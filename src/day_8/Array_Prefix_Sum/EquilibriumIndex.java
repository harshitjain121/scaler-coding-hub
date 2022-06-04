package day_8.Array_Prefix_Sum;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumIndex {
    
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(
            Arrays.asList(1, 2, 3, 7, 1, 2, 3)
        );
        // 1    2   3   7   1   2   3
        // 0    1   3   6   13  14  16  left sum
        // 18   16  13  6   5   3   0   reight sum

        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        //calculate thr PF array
        int[] pfSum = new int[A.size()];
        pfSum = calculatePFSum(pfSum, A);
        return equilibriumCount(pfSum, A, 0);
    }


    public static int[] calculatePFSum(int[] pfSum, ArrayList<Integer> A){
        pfSum[0] = A.get(0);
        for(int i=1; i<A.size(); i++){
            pfSum[i] = pfSum[i-1] + A.get(i);
        }
        return pfSum;
    }

    public static int equilibriumCount(int[] pfSum, ArrayList<Integer> A, int count){
        //edge case for i=0 - rightsum = 0
        if(pfSum[A.size()-1] - pfSum[0] == 0) count++;

        for(int i=1; i<A.size(); i++){
            int leftSum = pfSum[i-1];
            int rightSum = pfSum[A.size()-1] - pfSum[i];
            System.out.println("i  = "+ i +" : " +leftSum +"  -  "+ rightSum);
            if(leftSum == rightSum)
                count++;
        }
        return count;
    }
    
}
