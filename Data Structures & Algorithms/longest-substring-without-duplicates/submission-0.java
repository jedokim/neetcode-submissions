class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // if c is already in window...
            //   shrink from left until it's not
            while(window.contains(c)) {
                window.remove(s.charAt(left));
                left++;
            }
 
            // add c to window - if we reach here, that means window is completely unique
            window.add(s.charAt(right));
            // update maxLen using left and right
            maxLen = Math.max(right - left + 1, maxLen);
        }
        return maxLen;
    }
}