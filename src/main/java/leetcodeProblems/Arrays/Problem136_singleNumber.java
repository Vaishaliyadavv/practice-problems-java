package leetcodeProblems.Arrays;

//https://leetcode.com/problems/single-number/

public class Problem136_singleNumber {
    public int singleNumber(int[] nums) {
        int xor=0;
        for (int num : nums) {
            xor = xor ^ num;
        }
        return xor;
    }
}
