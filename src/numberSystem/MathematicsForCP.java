package numberSystem;

import java.util.Arrays;

public class MathematicsForCP {

    public static void main(String... a){
        // int num[] = {1305, 4665, 6905};
        System.out.println(lcm(6, lcm(9,lcm(15,18))));
        // System.out.println(greatestNumberThat_DivideAll_LeavingSameRemainder(num));
    }

    //note : to find all the prime numbers in a range 1 to n
    //OPTIMISED
    static boolean[] seiveOfEratoSthenes(int n){
        boolean[] isPrime = new boolean[n+1] ;
        Arrays.fill(isPrime, true);
        isPrime[0] = false; // 0 is not prime number
        isPrime[1] = false; // 1 is not prime number

        //debug:iterate till root N times
        for(int i = 2; i*i <= n ; i++){
            for (int j = 2*i; j < n; j +=i ) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

    //TODO: GCD -Euclidean ALGORITHM
    // using recursion approach
    static int gcd(int a, int b){
        //Hint : a>b OR if not then after 1st iteration - a>b | a will be greater
        return a % b == 0 ? b : gcd(b , a%b); 
    }

    //TODO: LCM - Euclidean ALGO
    static int lcm(int a, int b){
        return a*b/gcd(a, b);
    }

    //
    //TODO: greatest number that divide all the numbers in the array and leaves the same remainder for all eg:43,91,183
    static int greatestNumberThat_DivideAll_LeavingSameRemainder(int[] num){
        num = subtractEachInCycle(num);
        int result = num[0];
        for (int i = 1; i < num.length; i++) {
            result = gcd(result , num[i]);
        }
        return result;
    }

    //TODO: b-a, c-b, d-c, .... ending-starting
    static int[] subtractEachInCycle(int[] arr){
        int startingElement = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1] - arr[i];
        }
        arr[arr.length-1] = arr[arr.length-1] - startingElement;
        return arr;
    }
}
