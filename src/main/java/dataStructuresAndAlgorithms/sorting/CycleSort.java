package dataStructuresAndAlgorithms.sorting;

import static dataStructuresAndAlgorithms.recursion.GFGReverseAnArray.swap;

public class CycleSort {

    public static void cycleSort(int[] nums){
        int i = 0;

        while(i<nums.length){
            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else{
                i++;
            }

        }


    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,3,4};
        cycleSort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
