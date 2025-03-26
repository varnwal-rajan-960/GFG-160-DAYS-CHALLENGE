/**
 * Problem: 
 Move all zeroes to the end of the array(using single traversal).

 * 
 * Description:
 * - Rearrange the array to move all zeroes to the end while maintaining the 
 *   relative order of non-zero elements.
 * 
 * Approach:
 * - Traverse the array and swap non-zero elements with the earliest zero encountered.
   - The solution uses an in-place algorithm with O(n) time complexity.

 */

import java.util.Arrays;
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int c=0; //currently setting count to zero
        int i,temp;
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
                //swapping
                temp=arr[i];
                arr[i]=arr[c];
                arr[c]=temp;
                c+=1;
                //increasing value of count by 1
            }
        }
    }
}