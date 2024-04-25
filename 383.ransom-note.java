import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char curr = magazine.charAt(i);

            if (freq.containsKey(curr)) {
                freq.put(curr, freq.get(curr) + 1);
            } else {
                freq.put(curr, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char curr = ransomNote.charAt(i);

            if (freq.get(curr) == null || freq.get(curr) <= 0) {
                return false;
            }
            freq.put(curr, freq.get(curr) - 1);
        }

        return true;
    }
}
