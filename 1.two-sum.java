import java.util.*;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ret = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(nums[i])) {
                ret[0] = map.get(nums[i]);
                ret[1] = i;
                break;
            } else {
                map.put(complement, i);
            }
        }
        return ret;
    }
}
// @lc code=end
