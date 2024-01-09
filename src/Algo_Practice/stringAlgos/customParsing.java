package Algo_Practice.stringAlgos;

public class customParsing {

    public static boolean isAtEvenIndex(String s, char item){
        // We only need to check the even indices of the string
        // since we are checking only if the item is at an even index, we can skip the odd indices 
        // this will cut our time complexity in half 

        // ** Checking Base Cases ** 

        if (s == null || s.isEmpty()) {     // Check the null case first, since we cannot access a property of null. We would have a null pointer exception 
            return false;
        }

        for (int i = 0; i < s.length() / 2 + 1; i =i+2) {
            if (s.charAt(i) == item) {
                return true;
            } 
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
