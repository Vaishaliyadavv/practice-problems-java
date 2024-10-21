package dataStructuresAndAlgorithms.arrays;

public class FindMinimumValue {
    public static int findMinimumValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5, 6, 7};
        System.out.println(findMinimumValue(arr));
    }
}
