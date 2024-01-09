package Algo_Practice.stringAlgos;

// Strings are immutable 
// String Builder class provides an alternative String class, as it creates a mutable sequence of characters 
// When the string builder object is modified, it doesnt create a new string builder, it dynamically expands the memory to accommodate the modified string

public class reverseStrings {
    public static String reverse(String s){
        if (s == null || s.isEmpty()) {  // Base Cases 
            return s;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        
        System.out.println(reverse(null));
        System.out.println(reverse(""));
        System.out.println(reverse("Forearm"));
        System.out.println(reverse("Tacos"));
    }
}
