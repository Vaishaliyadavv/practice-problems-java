package leetcode150;

public class Problem169 {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int totalPoints = 0;
        int candidate = 0;
        for (int num : nums) {
            if (totalPoints == 0) {
                candidate = num;
            }
            if (candidate == num) {
                totalPoints++;
            } else {
                totalPoints--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        //int[] nums = {2,2,1,1,1,2,2};
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
