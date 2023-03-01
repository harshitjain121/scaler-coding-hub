package Interview_tips;


public class PhonePe {
    public static void main(String[] args) {
        //KADANES ALGO
        int[] nums = new int[]{-9, 5, -9, -8, 9, 7, -10, 10, 9};
        // int[] nums = new int[]{8,10,4,3,6,4,7};
        // int[] nums = new int[]{-6,-6,3,-2,8,-5,1,8};
        // int[] nums = new int[]{2,6,5,7,1,6,5};
        // int[] nums = new int[]{-5,-6,10,-2,5,4,5};
        // int[] nums = new int[]{-1,-1,-1,-1,-1};


        int n  = nums.length;
        int[] frontArr = new int[n];
        int[] backArr = new int[n];
        int curSum = 0;
        int maxSum = 0;

        //front kadanes
        for (int i = 0; i < n; i++) {
            curSum += nums[i];
            if(curSum < 0)  curSum = 0;
            if(curSum > maxSum) maxSum = curSum;

            // put the max sum to the array
            frontArr[i] = maxSum;
        }

        curSum = 0;
        maxSum = 0;

        //back kadanes and esko 1 shift krdo 
        backArr[n-1] = 0;
        for (int i = n-1; i >=1; i--) {
            curSum += nums[i];
            if(curSum < 0)  curSum = 0;
            if(curSum > maxSum) maxSum = curSum;

            // put the max sum to the array
            backArr[i-1] = maxSum;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(frontArr[i] + " - ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(backArr[i] + " - ");
        }
        System.out.println();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, frontArr[i] + backArr[i]);
        }
        System.out.println("-------------");
        System.out.println(ans);
    }
}
