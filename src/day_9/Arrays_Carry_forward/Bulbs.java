package day_9.Arrays_Carry_forward;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bulbs {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(
            Arrays.asList(0,0,0,0)
        );

        System.out.println(solve(A));
    }


    public static int solve(ArrayList<Integer> A) {
        int count = 0;
        for(int i=0; i<A.size(); i++){
            //switch is pressed even no. of times
            if(count%2 == 0 && A.get(i) == 0)
                count++;
            
            //switch is pressed odd no. of times
            if(count%2 != 0 && A.get(i) == 1)
                count++;
        }

        return count;
    }
}
