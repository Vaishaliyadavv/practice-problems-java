package leetcodeProblems.Arrays;

public class Problem1749_maxAbsoluteSum {
    public int maxAbsoluteSum(int[] nums) {
        int currMaxSum = nums[0];
        int currMinSum = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];

        for(int i = 1;i<nums.length;i++){
            currMaxSum = Math.max(nums[i], currMaxSum + nums[i]);
            maxSum = Math.max(currMaxSum ,maxSum);

            currMinSum = Math.min(nums[i], currMinSum + nums[i]);
            minSum = Math.min(currMinSum ,minSum);
        }

        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}
