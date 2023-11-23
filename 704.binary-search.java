/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        // return search_recursive(nums, target, 0, nums.length - 1);
        return search_iterative(nums, target, 0, nums.length - 1);
    }

    private int search_iterative(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }

    private int search_recursive(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] > target) {
            mid = search_recursive(nums, target, start, mid - 1);
        } else if (nums[mid] < target) {
            mid = search_recursive(nums, target, mid + 1, end);
        }
        return mid;
    }
}
// @lc code=end
