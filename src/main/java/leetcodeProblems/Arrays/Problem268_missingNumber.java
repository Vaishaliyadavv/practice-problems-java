package leetcodeProblems.Arrays;

//https://leetcode.com/problems/missing-number/description/

public class Problem268_missingNumber {
    public int missingNumber(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ i ^ nums[i];
        }
        return result ^ nums.length;
    }
}
