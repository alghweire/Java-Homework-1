package com.testpro.hw3 ;

import java.util.Scanner;

public class HW3 {

    // Was it a cat I saw // Create a method that will check if a given string is a palindrome. If it is it should print
    // “This string is a palindrome” if not print “This string is not a palindrome”
    //  Upload it to Github and share a link in Github with your exercise

    public static void main (String args[]) {

        Scanner a = new Scanner(System.in);
        System.out.println(" lets verify if your word or sentence is a Pelindrom ") ;
        String input = a.nextLine();
        String reverse = "";

        for ( int i = input.length() -1; i>= 0 ; i-- ) {
            reverse = reverse + input.charAt(i);
        }
            if (input.equals(reverse)) {

                System.out.println(" this is a pelindrom ");
            }
            else {
                System.out.println("this is not a pelindrom ");

            }





    }

}
