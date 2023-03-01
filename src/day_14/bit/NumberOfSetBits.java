package day_14.bit;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int A = 7;
        int count = 0;
        //Brian Kernighan Algorithm - count no. of set bits
        //at each iteration right most bits is set to 0 and count++
        while(A != 0){
            A = A & (A-1);
            // System.out.println("updated A : " + A);
            count++;
        }
        int xor = 6;
        // System.out.println(xor & -xor);
        // System.out.println("Number of set bits : " + count);


        int[][] arr = new int[][]{{1,1,1}, {1,1,1}, {1,1,1}};

        System.out.println(Arrays.deepToString(arr));

        long[][] pf = new long[3][3];

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         pf[i][j] = arr[i][j];

        //         if(i>0)
        //             pf[i][j] += pf[i-1][j];
        //         if(j>0)
        //             pf[i][j] += pf[i][j-1];
        //     }
        // }

        for (int i = 0; i < 3; i++) {
            pf[i][0] = arr[i][0];
            for (int j = 1; j < 3; j++) {
                pf[i][j] = pf[i][j-1] + arr[i][j];
            }
        }

        for (int j = 0; j < 3; j++) {
            // pf[i][0] = A.get(i).get(0);
            for (int i = 1; i < 3; i++) {
                pf[i][j] = pf[i-1][j] + pf[i][j];
            }
        }

        System.out.println(Arrays.deepToString(pf));
    }
}