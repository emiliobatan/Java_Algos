package Algo_Practice.stringAlgos;
 // Before processing a string, it can be helpful to normalize your string to a common form 

/*
  *     When we normalize our data to a common form, we make our algos 
        more flexible, more efficient and easier to read and maintain
  */

public class normailzeString {

        // String lowercased = s.toLowerCase();    // This will make the inputted string all lowercase
        // String trimmed = lowercased.trim();     // This will remove any whitespace from the front or end of the string NOT INSIDE the string
        // String normalized = trimmed.replace(",", "");   // This method will look for the specified target and replace with a new char/empty space

    public static String normalizedString(String s){
        return s.toLowerCase().trim().replace(",","");
    }

    public static void main(String[] args) {
        System.out.println(normalizedString("    Hello Over THERE    "));
        System.out.println(normalizedString("    Hello THERE    "));
        System.out.println(normalizedString("    Hello World    "));
        System.out.println(normalizedString("    Hello uSer    "));
        System.out.println(normalizedString("    Hello Anyone THERE?   "));


    }
}
