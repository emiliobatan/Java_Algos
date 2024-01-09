package Algo_Practice.stringAlgos;

public class reverseStringCont {

    // reverse2 takes in a string,
    // Then creates a stringbuilder using the stringbuilder class
    // Then uses the stringbuilder built in reverse method along with the toString
    // method.

    // This method allows us to be able to reverse an inputted string

    public static String reverse2(String s) {
        if (s == null || s.isEmpty()) { // Base Cases
            return s;
        }

        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse2("Hello"));
        System.out.println(reverse2("World"));
        System.out.println(reverse2("Emilio"));
        System.out.println(reverse2("Kaith"));
        System.out.println(reverse2("Go"));

    }
}
