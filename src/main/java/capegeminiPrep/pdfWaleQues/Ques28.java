package capegeminiPrep.pdfWaleQues;

public class Ques28 {

    public static int findMajority(int[] nums){
        int candidate = nums[0];
        int count = 1;

        for(int i=1;i<nums.length;i++){

            if(count == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count++;
            } else{
                count--;
            }
        }

        int freq = 0;

        for(int num:nums){
            if(num == candidate){
                freq++;
            }
        }

        if(freq > nums.length /2){
            return candidate;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = findMajority(nums);
        if (result != -1) {
            System.out.println("Majority element: " + result);
        } else {
            System.out.println("No majority element exists.");
        }
    }
}
