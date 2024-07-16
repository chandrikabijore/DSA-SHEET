// 1295. Find Numbers with Even Number of Digits
//Given an array nums of integers, return how many of them contain an even number of digits.
//Example 1:
//Input: nums = [12,345,2,6,7896]          //Output: 2
//Explanation:
//12 contains 2 digits (even number of digits).
//345 contains 3 digits (odd number of digits).
//2 contains 1 digit (odd number of digits).
//6 contains 1 digit (odd number of digits).
//7896 contains 4 digits (even number of digits).
//Therefore, only 12 and 7896 contain an even number of digits.
 
package com.chandrika;

public class DSA_00_PRACTICE
{
    public static void main(String[] args)
    {
        int[] nums = {12, 66, 78, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums)
    {
        int count = 0;

        for(int i =0 ; i< nums.length; i++)
        {
            if((nums[i] > 9 && nums[i] < 100) || (nums[i] > 999 && nums[i] < 10000) || nums[i] == 100000)
            {
                count++;
            }
        }
        return count;
    }
}   
