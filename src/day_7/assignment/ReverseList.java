package day_7.assignment;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        
        ArrayList<Integer> A = new ArrayList<Integer>(
            Arrays.asList(1,2,3,2,1)
        );

        System.out.println(solve(A));
        
    }

    public static ArrayList<Integer> solve(final List<Integer> A) {
        System.out.println(A);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=A.size()-1; i>=0; i--){
            list.add(A.get(i));
        }
        return list;
    }
}
