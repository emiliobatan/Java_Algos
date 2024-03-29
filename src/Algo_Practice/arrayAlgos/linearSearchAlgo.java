package Algo_Practice.arrayAlgos;

import java.util.Arrays;
import java.util.OptionalInt;

public class linearSearchAlgo {

    // int[] arr = { 1, 2, 3, 4, 5, 6, };
                //  c            i
    // item = 5
    
    // If you want to print out the item if found, you could but would need to change the method from boolean to int and return the item not true

    public static boolean linearSearch(int[] arr, int item){
        for (int current : arr){
            if (current == item) {
                // System.out.println(current);
                return true;
            }
        }

        return false;
    }


    public static OptionalInt linearSearch2(int [] arr, int item){
        return Arrays.stream(arr).filter(x -> x == item).findFirst();

    }

}
