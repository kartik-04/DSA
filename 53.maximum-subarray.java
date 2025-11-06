/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
                        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; i++){
                    if(currSum < 0){
                        currSum = 0;
                    }
                    currSum += nums[i];
                maxSum = Math.max(currSum, maxSum);
        
        }
     return maxSum;     
    }
}
// @lc code=end

