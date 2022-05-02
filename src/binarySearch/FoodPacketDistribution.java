package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class FoodPacketDistribution {
    
    public static void main(String... args) {
        ArrayList<Integer> A = new ArrayList<Integer>(
             Arrays.asList(8, 7, 1, 5, 5, 10, 10, 1, 5, 3)
         );
         //B = 17 |  8, 7, 1, 5, 5, 10, 10, 1, 5, 3 
         System.out.println(solve(A, 17));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int min = A.get(0);
        long sum = 0;

        for(int i=0; i<A.size(); i++){
            sum += A.get(i);
            min = Math.min(min, A.get(i));
        }
        if(sum < B){
            System.out.println("sum - "+sum);
            return 0;
        }
        // System.out.println("end - "+min);
        return binarySearch(A,B,min);
    }

    public static int binarySearch(ArrayList<Integer> A, int B, int e){
        int s = 1;
        int mid = s+ (e-s)/2;
        int ans = 0;

        while(s<=e){
            System.out.println("mid - "+mid);
            if(isPossible(mid, A, B)){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
            mid = s+ (e-s)/2;
        }
        return ans;
    }


    public static boolean isPossible(int k, ArrayList<Integer> A, int B){
        int req = 0;
        for(int i=0; i<A.size(); i++){
            req += (A.get(i))/k;
        }
        boolean res = req >= B;
        System.out.println("is possible : "+ req + "  -  " + res);
        return res;
    }
}
