package leetcodeProblems.patterns.cyclicSort;

import java.util.ArrayList;
import java.util.List;

import static dataStructuresAndAlgorithms.recursion.GFGReverseAnArray.swap;

public class Problem287_duplicateNumber {
    public int findDuplicate(int[] nums) {


        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[correct] != nums[i]){
                swap(nums,i,correct);
            } else{
                i++;
            }
        }


        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return j+1;
            }
        }

        return nums.length;
    }
}
