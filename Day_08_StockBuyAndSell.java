/**
 * Problem: Stock Buy and Sell to Maximize Profit (Single Transaction)
 *
 * Description:
 * - Given an array of stock prices where the i-th element represents the price of a stock on day i, 
 *   the task is to calculate the maximum profit achievable by completing at most one buy-and-sell transaction.
 * - If no profit can be made, the output should be 0.
 *
 * Approach:
 * - Traverse the array of stock prices:
 *   1. Keep track of the minimum price observed so far.
 *   2. For each price, calculate the potential profit (current price - minimum price).
 *   3. Update the maximum profit if the potential profit exceeds the previous maximum profit.
 * - This approach ensures an efficient solution with a single pass through the array.
 *
 * Example:
 * - Input: prices = [7, 1, 5, 3, 6, 4]
 * - Output: 5
 * - Explanation:
 *   - Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
 *
 * Key Features:
 * - Time Complexity: O(n) — Single traversal of the array.
 * - Space Complexity: O(1) — Uses only constant space.
 * - Handles edge cases, such as empty arrays or arrays with only one element.
 *
 * Key Takeaways:
 * - Demonstrates the use of greedy algorithms to solve optimization problems efficiently.
 * - Highlights the importance of tracking intermediate values (e.g., minPrice) to achieve optimal results.
 */
class Solution {
    public int maximumProfit(int prices[]) {
        if(prices == null || prices.length<2) {
            return 0; // no profit
        } 
        int minPrice = Integer.MAX_VALUE; //minimum price
        int maxProfit = 0;
        for(int price: prices){
            //updating minimum price
            minPrice = Math.min(minPrice,price);
            //calculating the maximum profit
            maxProfit = Math.max(maxProfit,price-minPrice);
        }
        return maxProfit;
        
    }
}