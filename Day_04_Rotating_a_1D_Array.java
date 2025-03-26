/**
 * Problem: Rotate a 1D array in a counterclockwise direction.
 *
 * Description:
 * Given an array, the goal is to rotate it to the left by a given number of positions (d). 
 * This involves shifting the elements in the array such that the first k elements 
 * are moved to the end while maintaining the order of the rest.
 *
 * Approach:
 * - Use modular arithmetic to handle cases where d > array length.
 * - Create a temporary array to store the rotated elements.
 * - Copy the rotated result back into the original array to reflect the changes in place.
 *
 * Example:
 * Input: arr = [1, 2, 3, 4, 5], d = 2
 * Output: arr = [3, 4, 5, 1, 2]
 *
 * Key Takeaways:
 * - Modular arithmetic simplifies rotation for large values of d.
 * - Rotations are commonly used in data manipulation tasks.
 */


// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        //handles the cases where d>n
        d=d%n;
        //creating a temporaray array to store the rotated result
        int[] rotated = new int[n];
        //shifting elements
        for(int i = 0;i<n;i++)
        {
            rotated[i]=arr[(i+d)%n];
        }
        //copy back to original array
        System.arraycopy(rotated,0,arr,0,n);
        //github account :- https:- github.com/varnwal-rajan-960
    }
}