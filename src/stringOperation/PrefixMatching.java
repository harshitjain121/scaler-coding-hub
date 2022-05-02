package stringOperation;

import java.util.ArrayList;
import java.util.Arrays;

class PrefixMatching{
     public static void main(String... args){
         ArrayList<String> A = new ArrayList<String>(
             Arrays.asList("aa", "aaab", "ab", "b", "bbb", "cbb")
         );
        //  input 1 = "aa", "aaab", "ab", "b"
        // input 2 = "aa", "aaab", "ab", "b", "bb", "bbb" 
         String B = "b"; // prefix
         ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(firstOccurrence_binarySearch(A, B));
        result.add(lastOccurrence_binarySearch(A,B));
        System.out.println(result);
     }

    public static boolean matchPrefix(String str, String pattern){
         System.out.println(str +"   ===>   "+ pattern);
        if(str.length() < pattern.length())
            return false;
        return (pattern.equals(str.substring(0, pattern.length())) );
    }

    public static int firstOccurrence_binarySearch(ArrayList<String> A, String key){
        int s = 0;
        int e = A.size()-1;
        int mid = s + (e-s)/2;
        int firstMatch = -1;

        while (s<=e) {
            //prefix found
            System.out.println("MID : LEFT "+ mid);
            if (matchPrefix(A.get(mid), key)) {
                // System.out.println("PATTERN FOUND");
                firstMatch = mid;
                // for first occurrence - go to left part
                e = mid - 1;
            } else if (key.compareTo(A.get(mid)) > 0) {
                // System.out.println("RIGHT");
                // go to right part
                s = mid + 1;
            } else {
                // System.out.println("LEFT");
                // go to left part - key < arr[mid]
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return firstMatch;
    }

    public static int lastOccurrence_binarySearch(ArrayList<String> A, String key){
        int s = 0;
        int e = A.size()-1;
        int mid = s + (e-s)/2;
        int lastMatch = -1;

        while (s<=e) {
            //prefix found
            System.out.println("MID : R "+ mid);
            if (matchPrefix(A.get(mid), key)) {
                // System.out.println("PATTERN MATECHED");
                lastMatch = mid;
                // for last occurrence - go to left part
                s = mid + 1;
            } else if (key.compareTo(A.get(mid)) > 0) {
                // System.out.println("RIGHT");
                // go to right part
                s = mid + 1;
            } else {
                // System.out.println("LEFT");
                // go to left part - key < arr[mid]
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return lastMatch;
    }
 }