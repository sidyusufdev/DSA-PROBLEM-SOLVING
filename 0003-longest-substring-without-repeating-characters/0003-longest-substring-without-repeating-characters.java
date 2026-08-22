import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Character already exists
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            // Current character ki latest position store karo
            map.put(ch, right);

            // Current window ki length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}