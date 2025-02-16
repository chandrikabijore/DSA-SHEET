package com.YouCanBro;

import java.util.Arrays;
public class Practice
{
    public static void main(String[] args) {
        // Original array with a single string element
        String[] originalArray = {"Chandrika"};

        // Get the single string from the array
        String originalString = originalArray[0];

        // Reverse the characters of the string
        String reversedString = new StringBuilder(originalString).reverse().toString();

        // Create a new array to store the reversed string
        String[] reversedArray = new String[1];
        reversedArray[0] = reversedString;

        // Print the original and reversed string arrays
        System.out.println("Original : " + Arrays.toString(originalArray));
        System.out.println("Reversed : " + Arrays.toString(reversedArray));
    }
}
