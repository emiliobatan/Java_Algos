package Algo_Practice.arrayAlgos;

public class arrayAlgoPrac {
    
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5, 6, };

        System.out.println(linearSearchAlgo.linearSearch(arr, 1));
        System.out.println(linearSearchAlgo.linearSearch(arr, 8));

        linearSearchAlgo.linearSearch2(arr, 1).ifPresent(System.out::println);
        linearSearchAlgo.linearSearch2(arr, 8).ifPresent(System.out::println);

    }
}
