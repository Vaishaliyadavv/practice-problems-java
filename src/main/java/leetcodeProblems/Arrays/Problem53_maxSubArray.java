package leetcodeProblems.Arrays;

//https://leetcode.com/problems/maximum-subarray/


public class Problem53_maxSubArray {
    public int maxSubArray(int[] nums) {

        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1;i<nums.length;i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(currSum ,maxSum);
        }
        return maxSum;
    }
}
