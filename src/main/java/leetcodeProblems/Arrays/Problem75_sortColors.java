package leetcodeProblems.Arrays;

//https://leetcode.com/problems/sort-colors/
public class Problem75_sortColors {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int r = 0;
        int w = 0;
        int b = nums.length-1;

        while(w <= b){
            if(nums[w] == 0){
                swap(nums,r,w);
                w++;
                r++;
            } else if(nums[w] == 2){
                swap(nums,w,b);
                b--;
            } else{
                w++;
            }
        }
    }
}
