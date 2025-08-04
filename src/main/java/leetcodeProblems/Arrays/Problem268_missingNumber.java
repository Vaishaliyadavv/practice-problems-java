package leetcodeProblems.Arrays;

//https://leetcode.com/problems/missing-number/description/

import static dataStructuresAndAlgorithms.recursion.GFGReverseAnArray.swap;

public class Problem268_missingNumber {
    public int missingNumber(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ i ^ nums[i];
        }
        return result ^ nums.length;
    }

    public int missingNumber2(int[] nums){

        int i =0;
        while(i<nums.length){
            int correct = nums[i];

            if(nums[i]< nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else{
                i++;
            }
        }

        for(int j = 0; j <nums.length; j++){
            if(nums[j] != j){
                return nums[j];
            }
        }

        return nums.length;
    }
}
