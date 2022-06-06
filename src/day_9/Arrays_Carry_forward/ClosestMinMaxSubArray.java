package day_9.Arrays_Carry_forward;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClosestMinMaxSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(
            Arrays.asList(4,4,4,4,4,4,4)
        );

        System.out.println(solve(A));
    }


    public static int solve(ArrayList<Integer> A) {
        int ans = A.size();
        int minInd = -1;
        int maxInd = -1;
        int max = Collections.max(A);
        int min = Collections.min(A);

        if(max == min)
            return 1;
        for(int i=A.size()-1; i>=0; i--){
            // max element found - CARRY FORWARD TECHNIQUE
            if(A.get(i) == max){
                maxInd = i;

                if(minInd != -1){
                    int len = Math.abs(maxInd - minInd) +1;
                    ans = Math.min(ans, len);
                }   
            }
            else if(A.get(i) == min){
                minInd = i;
                
                if(maxInd != -1){
                    int len = Math.abs(maxInd - minInd) +1;
                    ans = Math.min(ans, len);
                }
            }
        }
        return ans;
    }
}
