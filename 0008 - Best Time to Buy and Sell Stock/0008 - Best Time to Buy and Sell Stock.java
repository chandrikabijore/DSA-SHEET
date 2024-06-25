// 121. Best Time to Buy and Sell Stock (LEETCODE)
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//Example 1:
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
package com.YouCanBro;

public class SHEET_0008_Best_Time_to_Buy_and_Sell_Stock
{
    public static int maxProfit(int[] prices)
    {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] < min)
            {
                min = prices[i];
            }
            else
            {
                int diff = prices[i] - min;
                if (max < diff) max = diff;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] prices = {7, 1, 5, 3, 6, 4};           // 7,6,4,3,1 try this also profit will be 0
        System.out.println("Max Profit: " +  maxProfit(prices));
    }
}
