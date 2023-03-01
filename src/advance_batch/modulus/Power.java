package advance_batch.modulus;

public class Power {
    public static void main(String[] args) {
        int a = 123456789;
        int b = 56789432;
        int c = 15975368;
        System.out.println(pow(a, b, c));
    }

    public static int pow(int A, int B, int C) {
        //DO DRY RUN
        if(A == 0)  return 0;
        if(B == 0)  return 1;

        long halfpow = (long)pow(A,B/2, C);
        System.out.println("half power of "+ B/2 + "  :  " + halfpow);

        if(B % 2 == 0)
            return (int)((halfpow %C * halfpow %C) + C) % C ;
        else
            return (int)((halfpow %C * halfpow %C * A %C) + C) % C;
    }
}
