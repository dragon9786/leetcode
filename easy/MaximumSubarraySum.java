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