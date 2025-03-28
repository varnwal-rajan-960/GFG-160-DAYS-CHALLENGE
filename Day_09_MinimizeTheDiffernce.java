/**
 * Problem: Minimize the Difference Between Tallest and Shortest Towers
 *
 * Description:
 * Given an array of integers representing the heights of towers and a positive integer k, 
 * the task is to modify each tower's height by either increasing or decreasing it by k exactly once. 
 * The goal is to minimize the difference between the tallest and shortest towers after modification.
 * It is important to ensure no tower's height becomes negative after modification.
 *
 * Approach:
 * 1. Sort the array to simplify finding the tallest and shortest towers.
 * 2. Calculate the initial difference between the tallest and shortest towers.
 * 3. Iterate through the array, treating each tower as a potential boundary:
 *    - Update the tallest and shortest heights after modifying the towers.
 *    - Use modular arithmetic to ensure no negative heights.
 * 4. Track the minimum difference across all configurations.
 *
 * Example:
 * Input: arr = [1, 15, 10], k = 6
 * Output: 5
 * Explanation:
 * - Increase and decrease heights as needed: [7, 9, 15].
 * - Minimum difference between tallest and shortest = 5.
 *
 * Key Takeaways:
 * - Sorting the array simplifies calculations for boundary conditions.
 * - The greedy approach ensures the optimal solution with O(n log n) time complexity.
 * - Handling edge cases (like negative heights) is crucial.
 */
class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        
        int diff = arr[n - 1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - k < 0)
                continue;
            int min = Math.min(arr[0] + k, arr[i] - k);
            int max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            diff = Math.min(diff, max - min);
        }
        return diff;
    }
    }