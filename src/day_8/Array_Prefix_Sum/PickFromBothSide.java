package day_8.Array_Prefix_Sum;

import java.util.ArrayList;
import java.util.Arrays;
// IMPORTANT
public class PickFromBothSide {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(
                Arrays.asList(10, 8, 6, 4, 2, 1, 3, 7, 5, 9));

        System.out.println(solve(A, 4));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int[] pfSum = new int[A.size()];
        pfSum = calculatePrefixArray(pfSum, A);

        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i <= B; i++) {
            if (i == 0) {
                if (B == A.size()) {
                    ans = pfSum[A.size() - 1];
                } else {
                    ans = pfSum[A.size() - 1] - pfSum[A.size() - 1 - B]; // sum[n-1- B + 1, n-1]
                }
                continue;
            }
            leftSum = pfSum[i - 1];
            rightSum = pfSum[A.size() - 1] - pfSum[A.size() - 1 - B + i]; // sum[n-1- B, n-1]
            ans = Math.max(ans, leftSum + rightSum);
        }

        return ans;
    }

    public static int[] calculatePrefixArray(int[] pfSum, ArrayList<Integer> A) {
        pfSum[0] = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            pfSum[i] = pfSum[i - 1] + A.get(i);
        }
        return pfSum;
    }

}
