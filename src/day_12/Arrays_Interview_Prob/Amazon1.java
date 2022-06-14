package day_12.Arrays_Interview_Prob;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Amazon1 {


    public static void main(String ...args){
        List<String> orderList = new ArrayList<String>();
        List<String> prime = new ArrayList<String>();
        orderList.add("zld 93 12");
        orderList.add("fp kindle book");
        orderList.add("10a echo show");
        orderList.add("17g 12 25 6");
        orderList.add("ab1 kindle book");
        orderList.add("125 echo dot second generation");
        int c = 0;

        for (int i = 0; i < 6; i++) {
            String[] temp = orderList.get(c).split(" ",2);
            if(Character.isAlphabetic(temp[1].charAt(0))){
//                System.out.println("ENTER");
                prime.add(temp[1]+"-"+temp[0]);
                orderList.remove(c);
//                i--;
                c--;
//                System.out.println(c +"  "+ temp[1]+"-"+temp[0]);
//                continue;
                System.out.println("----");

            }
            c++;
        }
        Collections.sort(prime);

        for (int i=0; i< prime.size(); i++){
            String[] s = prime.get(i).split("-");
            prime.set(i,s[1]+" "+s[0]);
        }
        for(String s : orderList){
            prime.add(s);
        }

        for(String s : prime){
            System.out.println(s);
        }
//        for(String s : prime){
//            System.out.println(s);
//        }

//        System.out.println("*************************************************");
//        for (Map.Entry<String,String> entry : hm.entrySet())
//            System.out.println(entry.getKey() +"       " + entry.getValue());

//            System.out.println(s);
    }

}




//    public static int findIndex(int[] arr, int t){
//        int l = arr.length;
//
//        return IntStream
//                .range(0,l)
//                .filter(i -> t==arr[i])
//                .findFirst()
//                .orElse(-1);
//    }

