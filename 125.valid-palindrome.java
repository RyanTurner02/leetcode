/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        char[] sArr = s.toLowerCase().toCharArray();

        int left = 0;
        int right = sArr.length - 1;

        while (left < right) {
            while (left < sArr.length - 1 && !isAlphaNumeric(sArr[left])) {
                sArr[left] = '\0';
                left++;
            }

            while (right > 0 && !isAlphaNumeric(sArr[right])) {
                sArr[right] = '\0';
                right--;
            }

            if (sArr[left] == sArr[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }
}
// @lc code=end
