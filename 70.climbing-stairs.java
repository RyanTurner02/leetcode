/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        // return solve_rec(n);
        // return solve_memo(n);
        return solve_dp(n);
    }

    public int solve_rec(int n) {
        if (n < 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        int counter = 0;

        for (int i = 1; i <= 2; i++) {
            counter += solve_rec(n - i);
        }

        return counter;
    }

    public int solve_memo(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        int ret = solve_memo(memo, n);
        return ret;
    }

    private int solve_memo(int[] memo, int n) {
        if (n < 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        int counter = 0;

        for (int i = 1; i <= 2; i++) {
            counter += solve_memo(memo, n - i);
        }

        return memo[n] = counter;
    }

    public int solve_dp(int n) {
        int[] dp = new int[Math.max(2, n + 1)];
        int ret = solve_dp(dp, n);
        return ret;
    }

    private int solve_dp(int[] dp, int n) {
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
// @lc code=end
