package Algo_Practice.arrayAlgos;

public class reverseAlgoPrac {

    //  int[] arr = { 1, 2, 3, 4, 5, 6, };
    //  int[] result = {}
    //  Creating a new int array to store numbers in reverse order 
    //  We need to traverse through the original array 
    //  Reverse the order
        // Put the original array numbers (from the end) to the beginning of new array (REVERSING the order)
    
    public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            result[i] = arr[arr.length - 1 - i]; 
        }
        return result;
    }


    // ***** ANOTHER ALGO TO REVERSE *****

                   // 0              5 
    //  int[] arr = { 1, 2, 3, 4, 5, 6, };
    // create a temp value to swap places 
    // arr.length = 6
    // when loop starts: 
        // arr[i] = 0   arr[arr.length - 0 - 1] = 5
        

    public static void reverseInPlace(int[] arr){
        for(int i = 0; i < arr.length; i++){        // can also use i < arr.length / 2, since we only need to go through the array half as much 
            // Swap item at index(i) and 
            // item at index (arr.length - i - 1)
            int temp = arr[i];      //  temp = 1
            arr[i] = arr[arr.length - i - 1];   // arr[0] = 6 
            arr[arr.length - i - 1] = temp;     // arr[5] = 1
        }
    }
}
