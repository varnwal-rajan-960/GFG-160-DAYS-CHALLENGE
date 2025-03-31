/*
 * Problem: Find the maximum product in a subarray.
 * Approach: 
 * - Used Kadane's Algorithm for Maximum Product Subarray.
 * - Tracked both the maximum and minimum products at every step.
 * - Swapped the max and min products when encountering negative numbers.
 * 
 * Time Complexity: O(n), where n is the length of the array.
 * Space Complexity: O(1), as the solution uses only constant extra space.
 * 
 * Key Takeaways:
 * - Handling negative numbers smartly is essential.
 * - Edge cases like arrays containing zeros or negatives require special attention.
 */

 class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        if(arr==null || arr.length==0){
     throw new IllegalArgumentException("Array must not be empty.");
        }
        int max = arr[0];
        int min = arr[0];
        int result = arr[0];
        for(int i = 1 ;i <arr.length;i++){
            int current = arr[i];
            if(current<0){
                int temp = max;
                max=min;
                min= temp;
            }
            max = Math.max(current, current*max);
            min = Math.min(current, current*min);
            result = Math.max(result,max);
        }
        return result;
    }
}