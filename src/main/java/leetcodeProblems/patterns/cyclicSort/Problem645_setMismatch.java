package leetcodeProblems.patterns.cyclicSort;


import static dataStructuresAndAlgorithms.recursion.GFGReverseAnArray.swap;

//https://leetcode.com/problems/set-mismatch/
public class Problem645_setMismatch {

    public int[] findErrorNums(int[] nums) {
        int [] ans = new int[2];
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[correct] != nums[i]){
                swap(nums,i,correct);
            } else{
                i++;
            }
        }

        for(int j = 0; j <nums.length; j++){
            if(nums[j] != j+1){
                ans[0] = nums[j];
                ans[1] = j+1;
                break;
            }
        }
        return ans;
    }
}
