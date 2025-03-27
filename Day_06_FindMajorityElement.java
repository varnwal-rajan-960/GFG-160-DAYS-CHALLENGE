/**
 * Problem: Find Majority Elements Appearing More Than n/3 Times
 *
 * Description:
 * Given an integer array, the task is to find all elements that appear more than ⌊n/3⌋ times. 
 * At most, there can be two such majority elements in an array. This is an extension of 
 * the classic majority element problem and requires a more efficient approach than brute force.
 *
 * Approach:
 * - Use the Boyer-Moore Voting Algorithm to find up to two potential candidates:
 *   1. Traverse the array while maintaining two candidate variables and their counts.
 *   2. Adjust candidates based on the current element and their counts.
 * - Validate the candidates:
 *   1. Recount their occurrences in the array.
 *   2. Verify if their counts exceed ⌊n/3⌋.
 * - Return the validated majority elements.
 *
 * Example:
 * Input: nums = [1, 2, 3, 1, 1, 2, 2, 2]
 * Output: [1, 2]
 *
 * Key Takeaways:
 * - The Boyer-Moore Voting Algorithm is efficient, with a time complexity of O(n) 
 *   and a space complexity of O(1).
 * - The problem demonstrates the use of candidate elimination in large data sets.
 */



 class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n = nums.length;

        // Initialize two candidates and their counts
        int ele1 = -1, ele2 = -1;
        int cnt1 = 0, cnt2 = 0;

        for (int ele : nums) {
          
            // Increment count for candidate 1
            if (ele1 == ele) {
                cnt1++;
            }
          
            // Increment count for candidate 2
            else if (ele2 == ele) {
                cnt2++;
            }
          
            // New candidate 1 if count is zero
            else if (cnt1 == 0) {
                ele1 = ele;
                cnt1++;
            }
          
            // New candidate 2 if count is zero
            else if (cnt2 == 0) {
                ele2 = ele;
                cnt2++;
            }
          
            // Decrease counts if neither candidate
            else {
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;

        // Count the occurrences of candidates
        for (int ele : nums) {
            if (ele1 == ele) cnt1++;
            if (ele2 == ele) cnt2++;
        }

        // Add to result if they are majority elements
        if (cnt1 > n / 3) res.add(ele1);
        if (cnt2 > n / 3 && ele1 != ele2) res.add(ele2);
        
        if (res.size() == 2 && res.get(0) > res.get(1)) {
            int temp = res.get(0);
            res.set(0, res.get(1));
            res.set(1, temp);
        }
        return res;
    }
    }