package leetcode150;
//TODO WRONG CODE !! FIX IT
public class Problem27 {
    public static int removeElement(int[] nums, int val) {
        int elements = nums.length;
        for (int i = 0; i < elements - 1; i++){
            if (nums[i] == val){
                break;
            }
            for (int j = i; j < elements; j++){
                nums[j] = nums[j+1];
                elements--;
            }
        }
        return elements;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
