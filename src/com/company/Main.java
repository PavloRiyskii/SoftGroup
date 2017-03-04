package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number");
        String input = new Scanner(System.in).next();
        if(isPalindrom(input)) {
            System.out.println("Input is palindrom.");
        } else {
            System.out.println("Input is not a palindrom.");
        }
    }

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
