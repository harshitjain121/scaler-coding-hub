package day_11.Matrix_Arrays;

import java.util.ArrayList;
import java.util.Arrays;


public class DiagonalsMatrix {
    public static void main(String[] args)
    {
        int n = 3;
        ArrayList<ArrayList<Integer> > A = new ArrayList<ArrayList<Integer>>(n);
  
        // Create n lists one by one and append to the master list (ArrayList of ArrayList)
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        A.add(a1);
  
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(4);
        a2.add(5);
        a2.add(6);
        A.add(a2);
  
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(7);
        a3.add(8);
        a3.add(9);
        A.add(a3);
  
        printMatrix(A);
        allDiagonalsR2L(A);


    }
//      00  01  02
//      10  11  12
//      20  21  22

    // n*n matrix
    public static ArrayList<ArrayList<Integer>> allDiagonalsR2L(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer> > B = new ArrayList<ArrayList<Integer>>(3);
        for (int j = 0; j < A.size(); j++) {
            // int newC = -1;
            int row = 0;
            int col = j;
            B.add(new ArrayList<Integer>());
            while(row < A.size() && col >=0){
                int val = A.get(row).get(col);
                B.get(j).add(row, val);
                row++;
                col--;
            }  
            // System.out.println(); 
        }

        for (int i = 1; i < A.size(); i++) {
            int row = i;
            int col = A.size()-1;
            B.add(new ArrayList<Integer>());
            while(row < A.size() && col >=0){
                int val = A.get(row).get(col);
                // System.out.print(val + "  ");
                B.get(A.size() + i -1).add(row-i, val);
                row++;
                col--;
            }  
            System.out.println(); 
        }

        System.out.println();
        printMatrix(B);
        return B;
    }


    public static void printMatrix(ArrayList<ArrayList<Integer>> A) {
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.get(i).size(); j++) {
                System.out.print(A.get(i).get(j) + " ");
                // System.out.print(i+""+j+"  ");
            }
            System.out.println();
        }
    }
}