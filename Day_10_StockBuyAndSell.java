
/**
 * MaxSubarraySum - Implementation of Kadane's Algorithm
 * 
 * This program efficiently finds the maximum subarray sum in a given array.
 * It uses Kadane's Algorithm to solve the problem in O(n) time complexity.
 * 
 * Key Features:
 * - Handles arrays with both positive and negative numbers.
 * - Uses a dynamic programming approach to track the maximum subarray sum.
 * 
 * Example:
 * Input: {-2, 1, -3, 4, -1, 2, 1, -5, 4}
 * Output: Maximum subarray sum is 6 (subarray: {4, -1, 2, 1}).
 */
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    for(int num : arr){
        currentSum = Math.max(num,currentSum+num);
        maxSum = Math.max(maxSum,currentSum);
    }
        return maxSum;
    }
}