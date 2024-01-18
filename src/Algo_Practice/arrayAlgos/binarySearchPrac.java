package Algo_Practice.arrayAlgos;

public class binarySearchPrac {

            //       min      mid       max
    //  int[] arr = { 1, 2, 3, 4, 5, 6, };
    
    public static int binarySearch(int[] arr, int item){
        int min = 0;
        int max = arr.length -1;

        while(min <= max){
            int mid = (min + max) / 2;
            if (item == arr[mid]){
                return mid;
            } else if (item < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return -1;
    }
    

}
