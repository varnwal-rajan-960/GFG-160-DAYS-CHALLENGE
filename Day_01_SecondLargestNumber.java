/**
 * Day 1: Second Largest Number in an Array
 *
 * Problem Statement:
 * Write a program to find the second largest number in a given array of integers.
 *
 * Approach:
 * - Traverse the array to identify the largest and second-largest numbers.
 * - Ensure the algorithm works for both distinct and duplicate elements.
 * - Handle edge cases, such as arrays with less than two elements.
 *
 * Key Points:
 * - Input: An array of integers (e.g., [10, 20, 4, 45, 99]).
 * - Output: The second largest number (e.g., 45).
 * - Algorithm Complexity: O(n) for a single traversal of the array.
 */
 import java.util.Arrays; //gfg mein no need import file
class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
}