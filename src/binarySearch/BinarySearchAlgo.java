package binarySearch;

public class BinarySearchAlgo {

    public static void main(String[] args){
        int ar[] = {-20,8,-6,-14,0,-19,14,4};
        BinarySearchAlgo search = new BinarySearchAlgo();
        int ans = search.binarySearch(ar , 10 , 4);
        System.out.println(ans);
    }

    private int binarySearch(int[] arr, int size , int key){
        int s = 0;
        int e = size-1;
        int mid = s+(e-s)/2;

        while(s<=e){
            if(arr[mid] == key)
                return mid;
            // right wale part me jana h
            if(key > arr[mid])
                s = mid+1;
            else
                e = mid-1; // left wala part

            mid = s+(e-s)/2;
        }
        return -1;
    }
}
