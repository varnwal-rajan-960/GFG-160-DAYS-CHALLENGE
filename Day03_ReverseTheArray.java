/**
 * Problem: Reverse the array 
 Approach used - swapping 
 * 
 * Description:
 * - Rearrange the elements of the array so that the first element becomes the last, 
 *   the second becomes the second last, and so on.
 * 
 * Approach:
 * - Traverse the array and swap each element at index `i` with the element at 
 *   index `n - i - 1`, where `n` is the length of the array.
 * - Continue this process for the first half of the array to achieve the reversal.
 */

 class Solution {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        //iterating over half array for every index i
        for(int i = 0;i<n/2;i++){
            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
            //swapping 
        }
    }
}
