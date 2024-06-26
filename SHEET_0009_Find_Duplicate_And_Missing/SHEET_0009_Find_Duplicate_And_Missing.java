package com.YouCanBro;

public class SHEET_0009_Find_Duplicate_And_Missing
{
    public static int[] findErrorNums(int[] nums)
    {
        int n = nums.length;
        // Calculate the expected sum and sum of squares for numbers from 1 to n
        long sumExpected = n * (n + 1) / 2;
        long sumSquaresExpected = n * (n + 1) * (2 * n + 1) / 6;

        // Calculate the actual sum and sum of squares from the array            // We have:
        long sumActual = 0;                                                      // sumActual = sumExpected + A - B
        long sumSquaresActual = 0;                                               // sumSquaresActual = sumSquaresExpected + A^2 - B^2
        for (int num : nums)                                                     // Let's denote:
        {                                                                        // diffSum = A - B
            sumActual += num;                                                    // diffSquares = A^2 - B^2
            sumSquaresActual += (long) num * num;
        }

        long diffSum = sumActual - sumExpected;
        long diffSquares = sumSquaresActual - sumSquaresExpected;

        // From diffSquares = A^2 - B^2 = (A - B) * (A + B)
        // we get:
        // diffSquares = diffSum * (A + B)
        // A + B = diffSquares / diffSum

        long sumAB = diffSquares / diffSum;

        // Now we have:
        // A - B = diffSum
        // A + B = sumAB
        // Solving these two equations we get:
        // A = (diffSum + sumAB) / 2
        // B = sumAB - A

        int A = (int) ((diffSum + sumAB) / 2);
        int B = (int) (sumAB - A);

        return new int[]{A, B};
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 3};
        int[] result = findErrorNums(nums);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
}
