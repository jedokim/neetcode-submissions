class Solution {
    public boolean isAnagram(String s, String t) {
        // Super easy check with a O(1) time complexity that we can knock out of the way
        if (s.length() != t.length()) {
            return false;
        }
        // There are 26 characters in the alphabet. Since we start at 0, length is 26
        int[] charMap = new int[26];
        // Going to iterate over the s string and increment the count of each encountered character
        for (int i = 0; i < s.length(); i++) {
            charMap[s.charAt(i) - 'a'] = charMap[s.charAt(i) - 'a'] + 1;
        }

        for (int j = 0; j < t.length(); j++) {
            charMap[t.charAt(j) - 'a'] = charMap[t.charAt(j) - 'a'] - 1;
        }

        for (int k = 0; k < charMap.length; k++)  {
            if (charMap[k] < 0) {
                return false;
            }
        }
        return true;
    }
}