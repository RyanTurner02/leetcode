import java.util.*;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentS = s.charAt(i);
            char currentT = t.charAt(i);

            if (sMap.containsKey(currentS)) {
                sMap.put(currentS, sMap.get(currentS) + 1);
            } else {
                sMap.put(currentS, 1);
            }

            if (tMap.containsKey(currentT)) {
                tMap.put(currentT, tMap.get(currentT) + 1);
            } else {
                tMap.put(currentT, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (!sMap.get(current).equals(tMap.get(current))) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
