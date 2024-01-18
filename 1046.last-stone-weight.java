/*
 * @lc app=leetcode id=1046 lang=java
 *
 * [1046] Last Stone Weight
 */

// @lc code=start

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < stones.length; i++) {
            pq.add(stones[i]);
        }

        while(pq.size() > 1) {
            int y = pq.poll();
            int x = pq.poll();

            if(x < y) {
                pq.add(y - x);
            }
        }

        if(pq.isEmpty()) return 0;
        return pq.peek();
    }
}
// @lc code=end

