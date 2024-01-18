package Algo_Practice.arrayAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class aggregatePrac {
    
    public static int[] findEvenNums(int[] arr1, int[] arr2){
        ArrayList<Integer> result = new ArrayList<>();

        // We use a for each loop because the index does not matter for the comparison between the arrays
        for (int num : arr1){
            if (num % 2 == 0){
                result.add(num);
            }
        }

        for (int num : arr2){
            if (num % 2 == 0){
                result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();

    }

    // Can create the same method without using the for loops 
    // We can use Java streams to make the implementation simpler

    public static int[] findEvenNums2(int[] arr1, int[] arr2){
        IntPredicate isEvenPred = num -> num % 2 == 0;
        return Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).filter(isEvenPred).toArray();
    }
}
