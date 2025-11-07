/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 0){
            return "";
        }
        if(n == 1){
            return strs[0];
        }
        String prefix = strs[0];
        for(int i = 1; i < n; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;   
    }
}
// @lc code=end

