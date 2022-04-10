package jorn.hiel.hackerrank.problemsolving.strongPassword;

import jorn.hiel.hackerrank.BaseClass;

public class Solution extends BaseClass {

    // Complete the minimumNumber function below.
    static int minimumNumber(int minimal, String password) {

        int minimalLength=6;
        boolean numberPresent=false;
        boolean upperCasePresent=false;
        boolean lowerCasePresent=false;
        boolean specialCharacterPresent=false;
        String special_characters = "!@#$%^&*()-+";



        for (int i = 0; i < password.length(); i++) {
            char currentCharacter = password.charAt(i);
            if (Character.isDigit(currentCharacter) ) {
                numberPresent = true;
            }
            if (Character.isUpperCase(currentCharacter)) {
                upperCasePresent = true;
            }
            if (Character.isLowerCase(currentCharacter)) {
               lowerCasePresent = true;
            }

            if (special_characters.contains(String.valueOf(currentCharacter))) {

                specialCharacterPresent = true;
            }
        }

        int result = (numberPresent ? 0 : 1) + (upperCasePresent ? 0 : 1) + (lowerCasePresent ? 0 : 1) + (specialCharacterPresent ? 0 : 1);
        int counter=minimalLength-password.length();


        return Math.max(counter, result);


    }


    public static void main(String[] args)  {

        System.out.println(minimumNumber(3,"Ab1"));
        System.out.println(minimumNumber(4,"&+^&"));


    }
}