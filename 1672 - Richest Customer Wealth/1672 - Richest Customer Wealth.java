// https://leetcode.com/problems/richest-customer-wealth/

package com.chandrika;

public class DSA_09_K8_Code_MaxWealth
{
    public static void main(String[] args)
    {
        int[][] accounts = { {1, 2, 3}, {3, 2, 1} };
        int result = maximumWealth(accounts);
        System.out.println("The maximum wealth is: " + result);
    }

    public static int maximumWealth(int[][] accounts)
    {
        int ans=0;
        for (int person = 0; person < accounts.length; person++)     // person = rol   account = col
        {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++)
            {
                sum += accounts[person][account];
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
