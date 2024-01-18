package Algo_Practice.arrayAlgos;

import java.util.Arrays;

public class arrayAlgoPrac {
    
    public static void main(String[] args) {
        
        // int[] arr = { 1, 2, 3, 4, 5, 6, };

        // System.out.println(linearSearchAlgo.linearSearch(arr, 1));
        // System.out.println(linearSearchAlgo.linearSearch(arr, 8));

        // linearSearchAlgo.linearSearch2(arr, 1).ifPresent(System.out::println);
        // linearSearchAlgo.linearSearch2(arr, 8).ifPresent(System.out::println);

        // System.out.println(binarySearchPrac.binarySearch(arr, 3));
        // System.out.println(binarySearchPrac.binarySearch(arr, 1));
        // System.out.println(binarySearchPrac.binarySearch(arr, 8));

        // Arrays.binarySearch(arr, 3);
        // The arrays class already has a built in binary search method but it is useful to know how to build one 

        int[] arr1 = { -9, 3, 2, -8, 12, -16 };
        int[] arr2 = { 0, -3, -8, -35, 40, 20, 7 };
        
        Arrays.stream(aggregatePrac.findEvenNums(arr1, arr2))
        .forEach(System.out::println);

        System.err.println();

        Arrays.stream(aggregatePrac.findEvenNums2(arr1, arr2))
        .forEach(System.out::println);
    }
}
