import java.util.*;

/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int current = pq.poll();
            counter++;

            if(counter == k) {
                return current;
            }
        }
        return Integer.MIN_VALUE;
    }
}
// @lc code=end
