package com.testpro.hw2;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        //write your code here
        //Upload your file with link to you Github repo with solutions for:
        //You need to create a program, which will accept a string and check if total count on characters within the string is even it should return:
        //“String is even” If not it should return: “String is not even”
        EvenNumber("");
    }

    public static void EvenNumber(String a) {

        for (int i = 0; i < 10; i++) {
            Scanner b = new Scanner(System.in); // to have the user input we need this method.
            System.out.println(" Enter a String ");
            a = b.nextLine(); // this works with the scanner method to enable input.
            if ((a.length() % 2) == 0) {  // we need to see what is an even number . an even number is a number  by two .
                System.out.println("String is Even");

            } else {
                System.out.println("String is not even");
            }

        }
    }
}
