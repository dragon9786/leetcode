/**
 * https://leetcode.com/problems/maximum-subarray/
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 * Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 **/

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        int maxGlobal = nums[0];
        int maxLocal = nums[0];
        for(int i= 1; i<nums.length; i++) {
            maxLocal = Math.max(nums[i], maxLocal + nums[i]);
            maxGlobal = Math.max(maxLocal, maxGlobal);
        }
        return maxGlobal;
    }
}