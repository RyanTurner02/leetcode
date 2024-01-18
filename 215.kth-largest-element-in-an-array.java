import java.util.*;

/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length / 2; i++) {
            pq1.add(nums[i]);
        }

        for (int i = nums.length / 2; i < nums.length; i++) {
            pq2.add(nums[i]);
        }

        int counter = 0;
        Integer current = null;

        while (!pq1.isEmpty() || !pq2.isEmpty()) {
            if (!pq1.isEmpty() && !pq2.isEmpty()) {
                if (pq1.peek() > pq2.peek()) {
                    current = pq1.poll();
                } else {
                    current = pq2.poll();
                }
            } else if (!pq1.isEmpty() && pq2.isEmpty()) {
                current = pq1.poll();
            } else if (pq1.isEmpty() && !pq2.isEmpty()) {
                current = pq2.poll();
            }
            counter++;

            if (counter == k) {
                return current;
            }
        }
        return current;
    }
}
// @lc code=end
