/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int start = 0;
        int currentProfit = 0;
        int maxProfit = 0;

        for (int end = 0; end < prices.length; end++) {
            currentProfit = prices[end] - prices[start];
            maxProfit = Math.max(maxProfit, currentProfit);

            if (prices[end] < prices[start]) {
                start = end;
            }
        }
        return maxProfit;
    }
}
// @lc code=end
