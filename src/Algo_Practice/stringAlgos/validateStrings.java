package Algo_Practice.stringAlgos;
/*
 *  One type of algo you can create is a validation algorithm
 *  A validation algo will test if a given piece fo data has a certain property 
 *  ex: (Does the string have all alphabetical characters) or (have a number inside)
 * 
 *  The output of a Validation Algo is either true or false
 * 
 */

public class validateStrings {
    public static boolean isUpperCase(String s){ // This function will test if the String has all upperCase letters 
        return s.chars().allMatch(Character::isUpperCase);

        // if all characters in the String match the test, it will return True
    }

    public static boolean isLowerCase(String s){
        // s.chars().noneMatch(Character::isLowerCase);
        return s.chars().allMatch(Character::isLowerCase);
    }
    public static void main(String[] args) {
        String testString = "hello";
        String upperCase = "HELLO";

        System.out.println(isUpperCase(testString));
        System.out.println(isUpperCase(upperCase));

        System.out.println(isLowerCase(testString));
        System.out.println(isLowerCase(upperCase));
    }
}
