package queue_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AccountManager {

    public static void main(String... a) {
        ArrayList<Integer> C = new ArrayList<Integer>(
             Arrays.asList(3, 4, 6, 8, 18, 20)
         );
         solve(6, 9, C);     
    }
    
    public static ArrayList<Integer> solve(int A, int B, ArrayList<Integer> C) {
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i=0; i<C.size(); i++){
            if(isAccountAvailable(q, A, B, C.get(i))){
                C.set(i , A - q.size());
            }
            else{
                C.set(i , 0);
            }
        }
        System.out.println(C);
        return C;
    }

    public static boolean isAccountAvailable(Queue<Integer> q, int A, int B, int val){
        // iterate through the queue
        while(q.size() > 0 && q.peek() <= val){
            //pop the element
                q.remove();
        }
        // check the size and add the element
        if(q.size() < A){
            q.add(val + B);
            return true;
        }
        return false;
    }
}
