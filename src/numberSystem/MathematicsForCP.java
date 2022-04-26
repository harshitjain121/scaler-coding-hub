package numberSystem;

import java.util.Arrays;

public class MathematicsForCP {

    public static void main(String... a){
        boolean isPrime[] = seiveOfEratoSthenes(12);
        for (int i = 1; i < isPrime.length; i++) {
            System.out.println(i + " "+ isPrime[i]);
        }
    }

    //note : to find all the prime numbers in a range 1 to n
    //OPTIMISED
    static boolean[] seiveOfEratoSthenes(int n){
        boolean[] isPrime = new boolean[n+1] ;
        Arrays.fill(isPrime, true);
        isPrime[0] = false; // 0 is not prime number
        isPrime[1] = false; // 1 is not prime number

        //iterate till root N times
        for(int i = 2; i*i <= n ; i++){
            for (int j = 2*i; j < n; j +=i ) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

    //TODO: GCD - 
}
