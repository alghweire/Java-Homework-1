package com.testpro.hw1;

import java.lang.ArrayIndexOutOfBoundsException;

public class Main {


    public static void main(String[] args) {



// Question 1: create a loop that wil print out numbers 1- 10 except #7
        for (int i = 0; i <= 10; i++) {
            if (i != 7) {
                System.out.println(i);
                continue;
            }

// Question 2: Create An Array of integers from 1 to 5, Call an integer on array using index and print it.
        int[] array = {1, 2, 3, 4, 5};
            System.out.println(array[1]);



// Question 3: Call index outside of the bound. Handle this exception printing “Outside of bound message.”

            try {
                //  Block of code to try
                int[] arr = {1, 2, 3};
                System.out.println(arr[4]);
            } catch (Exception e) {
                //  Block of code to handle errors
                System.out.println("Outside of bound message.");
            }

            }


    }
}
