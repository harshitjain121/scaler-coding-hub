package day_12.Arrays_Interview_Prob;

public class MaxConsecutiveOnce {
    public static void main(String[] args) {
        // int[] arr = new int[]{0,1,0,1,0,0,1,1,0,1,0,1};
        int[] arr = new int[]{0,1};

        int n = arr.length;
        int i=0;
        int count = 0;
        int len = 0;
        for(int j=0; j<n; j++){
            if(arr[j] == 0)
                count++;
            
            while(count > 1 && i < j){
                if(arr[i] == 0){
                    count--;
                }
                i++;
            }

            len = Math.max(len, j-i+1);
            System.out.println(len);
        }
    }
}
