package advance_batch.prime;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    // static ArrayList<Integer> result = new ArrayList<Integer>(
    //     Arrays.asList(2,1,4,3,2)
    // );

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<Integer>(
            Arrays.asList(3, 30, 34, 5, 9)
        );
        System.out.println(result);
        result.sort((x,y) -> {
            if(x == y)  return 0;
            String first = String.valueOf(x);
            String second = String.valueOf(y);
            // System.out.print(second+first + " --- "+ first+second +" ");
            // System.out.println((first+second).compareTo(second+first));
            // return (first+second).compareTo(second+first);
            // System.out.println((second+first).compareTo(first+second));
            return (second+first).compareTo(first+second);
        });

        System.out.println(result);
    }

    
}
