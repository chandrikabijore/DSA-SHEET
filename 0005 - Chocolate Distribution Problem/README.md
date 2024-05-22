[Chocolate Distribution Problem](https://www.geeksforgeeks.org/chocolate-distribution-problem/)
---------------------------------------------------------------------------------------------------------------------------------------------

Last Updated : 22 May, 2024

Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

- Each student gets one packet.

- The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.

#### Examples:
```
Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
Output: Minimum Difference is 2 
Explanation:
We have seven packets of chocolates and we need to pick three packets for 3 students 
If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.

Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 
Output: Minimum Difference is 6 

Input : arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50} , m = 7 
Output: Minimum Difference is 10 
```
##### Follow the steps mentioned below to implement the approach:
```
Initially sort the given array. And declare a variable to store the minimum difference, and initialize it to INT_MAX. Let the variable be min_diff.

Find the subarray of size m such that the difference between the last (maximum in case of sorted) and first (minimum in case of sorted) elements of the subarray is minimum.

We will run a loop from 0 to (n-m), where n is the size of the given array and m is the size of the subarray.

We will calculate the maximum difference with the subarray and store it in diff = arr[highest index] – arr[lowest index]

Whenever we get a diff less than the min_diff, we will update the min_diff with diff.
```
