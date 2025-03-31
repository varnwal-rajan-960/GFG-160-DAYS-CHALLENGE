/**
 * Problem:
 * Find the maximum sum of a subarray in a circular array. The subarray can either be a normal subarray or a circular one that wraps around the array.
 * 
 * Approach:
 * 1. Use Kadane's algorithm to find:
 *    - The maximum subarray sum (normalSum).
 *    - The minimum subarray sum (minSum).
 * 2. Calculate the total sum of the array (totalSum).
 * 3. Compute the circular subarray sum as circularSum = totalSum - minSum.
 * 4. Handle the edge case where all elements are negative (i.e., minSum == totalSum), in which case return normalSum.
 * 5. Return the maximum of normalSum and circularSum.
 * 
 * Key Points:
 * - Combines Kadane's algorithm with a circular array concept.
 * - Efficiently handles both normal and circular subarray sums in one pass.
 * 
 * Complexity:
 * - Time Complexity: O(n), as the array is traversed once.
 * - Space Complexity: O(1), as no extra space is used beyond variables.
 */

 class Solution {
    public int circularSubarraySum(int arr[]) {

        int totalSum = 0;    
        int currMaxSum = 0, currMinSum = 0;
        int maxSum = arr[0], minSum = arr[0];
        
        for(int i = 0; i < arr.length; i++) {
          
            currMaxSum = Math.max(currMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currMaxSum); 
          
        
            currMinSum = Math.min(currMinSum + arr[i], arr[i]);
            minSum = Math.min(minSum, currMinSum);
            
            
            totalSum += arr[i];
        }
        
        int normalSum = maxSum;
        int circularSum = totalSum - minSum;
        
     
        if(minSum == totalSum)
            return normalSum;
        
        return Math.max(normalSum, circularSum);
    }
}