package leetcodeProblems.Arrays;

public class Problem169_majorityElement {
    public int majorityElement(int[] nums) {

        int candidate = nums[0];
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
