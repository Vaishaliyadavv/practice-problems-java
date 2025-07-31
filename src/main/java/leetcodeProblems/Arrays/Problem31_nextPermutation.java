package leetcodeProblems.Arrays;

//https://leetcode.com/problems/next-permutation/
public class Problem31_nextPermutation {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int index = -1;

        for(int i = n-1;i>0;i--){
            if(nums[i] > nums[i-1]){
                index = i-1;
                break;
            }
        }

        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        int swapIndex = index;

        for(int i=n-1;i>=index+1;i--){
            if(nums[i] > nums[index]){
                swapIndex = i;
                break;
            }
        }

        swap(nums,index,swapIndex);

        reverse(nums,index+1,n-1);

    }
}
