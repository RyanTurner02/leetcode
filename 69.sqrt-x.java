/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        double low = 0;
        double high = x;
        double mid = 1;

        for (int iter = 0; iter < 100; iter++) {
            mid = low + (high - low) / 2.0;
            double midSquared = mid * mid;

            if (midSquared > x) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return (int) mid;
    }
}
// @lc code=end
