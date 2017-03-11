package com.company;

public class PalindromCheck{

    /**
     *
     * O(n/2) where n is number of elements in the string
     * @param number the string with the number
     * @return false if number isn`t palindrom or if it`s not a number an true if it is palindrom
     */
    private static boolean isPalindrom(String number) {
        try{
            Integer.parseInt(number);
        } catch(NumberFormatException ex) {
            return false;
        }
        for(int i = 0; i < number.length() / 2; i++ ) {
            if(number.charAt(i) != number.charAt(number .length()- i - 1)) {
                return false;
            }
        }
        return true;
    }

}
