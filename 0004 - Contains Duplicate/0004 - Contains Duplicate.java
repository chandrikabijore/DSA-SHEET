package com.chandrikabijore;

public class SHEET_0004_Contains_Duplicate
{
    public static void main(String[] args)
    {
        Solution sol = new Solution();
        int[] testCase1 = {1, 2, 3, 4};
        int[] testCase2 = {1, 2, 3, 1}; 
        int[] testCase3 = {1, 2, 3, 1, 1, 3, 4, 4};
        int[] testCase4 = {};  

        System.out.println(sol.ContainsDuplicate(testCase1));
        System.out.println(sol.ContainsDuplicate(testCase2));
        System.out.println(sol.ContainsDuplicate(testCase3));
        System.out.println(sol.ContainsDuplicate(testCase4));
    }
} 
  
class Solution
{
    public boolean ContainsDuplicate(int[] nums)
    {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++)  
        {
            for (int j = i + 1; j < n; j++)
            {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}
