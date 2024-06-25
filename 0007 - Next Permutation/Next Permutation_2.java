package com.YouCanBro;

import java.util.Arrays;

public class SHEET_0007_Next_Permutation
{
    public void nextPermutation(int[] nums)
    {
        int i = nums.length - 2;
        int j = 0;
        while (i >= 0 && nums[i] >= nums[i+1])
        {
            i--;
        }
        if (i >= 0)
        {
            j = nums.length - 1;
            while (nums[j] <= nums[i])
            {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }

    public static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int i, int j)
    {
        while (i < j)
        {
            swap(nums, i++, j--);
        }
    }

    public static void main(String[] args)
    {
        SHEET_0007_Next_Permutation solution = new SHEET_0007_Next_Permutation();

        int[] nums = {1, 2, 3};
        System.out.println("Original array: \n" + Arrays.toString(nums));

        solution.nextPermutation(nums);
        System.out.println("Next permutation: \n" + Arrays.toString(nums));
    }
}
