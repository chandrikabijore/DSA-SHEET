package com.chandrikabijore;

import java.util.Arrays;

public class SHEET_0002_Array_int_Reverse
{
    public static void main(String[] args)
    {
        int[] OriginalArray = {1, 2, 3, 4, 5};

        int[] ReversedArray = new int[OriginalArray.length];
 
        for (int i = 0; i <  OriginalArray.length; i++)
        {
            ReversedArray[i] = OriginalArray[OriginalArray.length - 1 - i];
        }
        
        System.out.println("Original array is : " + Arrays.toString(OriginalArray));
        System.out.println("Reversed array is : " + Arrays.toString(ReversedArray));
    }
}
