// JAVA Code For Chocolate Distribution Problem
package com.chandrikabijore;

import java.util.Arrays;
public class SHEET_0005_ChocolateDistributionProblem
{
    public static int findMinDifference(int[] arr, int m)
    {
        // If there are no chocolates or students
        if (arr.length == 0 || m == 0)
        {
            return 0;
        }

        // Number of students cannot be more than number of packets
        if (arr.length < m)
        {
            return -1; // Not enough packets to distribute
        }

        // Sort the given packets
        Arrays.sort(arr);

        // Initialize the minimum difference as a large number
        int minDifference = Integer.MAX_VALUE;

        // Find the subarray of size m such that difference between the last (maximum) and first (minimum) elements is minimized
        for (int i = 0; i + m - 1 < arr.length; i++)
        {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < minDifference) {
                minDifference = diff;
            }
        }
        System.out.println(minDifference);

        return minDifference;
    }

    public static void main(String[] args)
    {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.println("Minimum Difference is " + findMinDifference(arr, m)); // Expected output: 2
    }
}

