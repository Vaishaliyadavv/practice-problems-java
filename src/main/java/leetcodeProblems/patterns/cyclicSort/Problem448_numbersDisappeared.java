package leetcodeProblems.patterns.cyclicSort;

import java.util.ArrayList;
import java.util.List;

import static dataStructuresAndAlgorithms.recursion.GFGReverseAnArray.swap;


//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class Problem448_numbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> notAppear = new ArrayList<>();

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
                notAppear.add(j+1);
            }
        }


        return notAppear;
    }

}
