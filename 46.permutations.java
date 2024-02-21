/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

import java.util.*;

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        int[] perm = new int[nums.length];
        boolean[] used = new boolean[nums.length];
        int k = 0;
        permute(ret, nums, perm, used, k);
        return ret;
    }

    private void permute(List<List<Integer>> ret, int[] nums, int[] perm, boolean[] used, int k) {
        if(k == nums.length) {
            List<Integer> curr = new ArrayList<>();
            for(int i = 0; i < nums.length; i++) {
                curr.add(perm[i]);
            }
            ret.add(curr);
        }

        for(int i = 0; i < nums.length; i++) {
            if(!used[i]) {
                used[i] = true;
                perm[k] = nums[i];
                permute(ret, nums, perm, used, k + 1);
                used[i] = false;
            }
        }
    }
}
// @lc code=end

