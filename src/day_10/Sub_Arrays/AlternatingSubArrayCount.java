package day_10.Sub_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatingSubArrayCount {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(
            Arrays.asList(0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1)
        );
        System.out.println(solve(A, 0));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int totLen = 2*B + 1;
        if(A.size() < B)  return result;
        int end = 0;
        int i =0;
        int count = 1;
        while(i < A.size() - totLen){
            // int count = 1;
            while(end+1 < A.size() && count < totLen){
                if(A.get(end) != A.get(end+1)){
                    end++;
                    count++;
                }
                else{
                    end++;;
                    i = end;
                    count = 1;
                }
            }
            System.out.println(i +" - "+ end);
            System.out.println("count  "+ count +" -> "+ (i+B));
            if(count == totLen){
                result.add(i+B);
                i++;
                count--;
            }
            System.out.println("next -- > " + i);
        }
        
        return result;
    }
}
