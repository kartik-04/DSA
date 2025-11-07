/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
       int m = t.length();
       if(n != m){
        return false;
       }

    Map<Character, Integer> map = new HashMap<>();

        // Count frequency of each char in s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Subtract using t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) {
                return false; // char not found in s
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) {
                return false; // more occurrences in t than s
            }
        }

       return true;
    }
}
// @lc code=end

