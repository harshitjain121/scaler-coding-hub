package day_7.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoodPair {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> A = new ArrayList<Integer>(
            Arrays.asList(1,2,3,4)
        );

        System.out.println(solve(A, 7));
        
    }

    public static int solve(ArrayList<Integer> A, int B) {
        Set<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int n : A){
            if(set.contains(B-n))
                count++;
            set.add(n);
        }

        return count;
    }
}
