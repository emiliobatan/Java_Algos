package Algo_Practice.stringAlgos;

public class validateExtra {

    // check to see if a string has a lower case letter, upper case letter and a number


    public static boolean isPasswordComplex(String s){
        return s.chars().anyMatch(Character::isUpperCase) &&        // Checks for an upper case char
                s.chars().anyMatch(Character::isLowerCase) &&       // Checks for a lower case char
                s.chars().anyMatch(Character::isDigit);             // Checks for any number
    }
    public static void main(String[] args) {
        System.out.println(isPasswordComplex("Hell0"));
        System.out.println(isPasswordComplex("Hello"));
        System.out.println(isPasswordComplex("hellO"));
        System.out.println(isPasswordComplex("heLLo"));
        System.out.println(isPasswordComplex("hello"));
        System.out.println(isPasswordComplex(""));
    }
}
