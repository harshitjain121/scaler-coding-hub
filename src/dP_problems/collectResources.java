package dP_problems;

import java.util.ArrayList;

public class collectResources{

    public int solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        // define arrayList
        int r = A.size();
        int c = A.get(0).size();
        int[][] dp = new int[r][c];
        
        for(int i=0; i < r ; i++){
            for(int j=0; j < c ; j++){
                // calculate the prefix sum
                dp[i][j] = Math.max(calculatePrefixSum_A(dp, A, i, j) , calculatePrefixSum_B(dp, B, i, j));
            }
        }

        return dp[r-1][c-1];
    }

    // decide any matrix with horizontal or vertical conveyer belt
    //calculate horizontal sum
    public int calculatePrefixSum_B(int[][] dp , ArrayList<ArrayList<Integer>> B, int i , int j){
        int s = 0;
        if (i > 0)
            s = dp[i-1][j];
        while(j>=0){
            // j = 0,1,2....n-1
            s = s+ B.get(i).get(j--);
        }
        return s;
    }

    // calculate vertical sum
    public int calculatePrefixSum_A(int[][] dp ,ArrayList<ArrayList<Integer>> A, int i , int j){
        int p = 0;
        if (j > 0)
            p = dp[i][j-1];
        while(i>=0){
            // i = 0,1,2....n-1
            p = p+ A.get(i--).get(j);
        }
        return p;
    }
}
