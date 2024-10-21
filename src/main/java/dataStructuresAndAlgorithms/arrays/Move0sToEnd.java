package dataStructuresAndAlgorithms.arrays;

public class Move0sToEnd {

    //O(N) APPROACH
    public static void moveZeros1(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] != 0 && nums[j] ==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[j]!=0){
                j++;
            }
        }

    }
    //O(1) APPROACH -------BETTER-------
    public void moveZeroes2(int[] nums) {
        int snowBallSize = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                snowBallSize++;
            }
            else if (snowBallSize > 0) {
                int t = nums[i];
                nums[i]=0;
                nums[i-snowBallSize]=t;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 4, 13};
        moveZeros1(arr);
        printArray(arr);
    }
}
