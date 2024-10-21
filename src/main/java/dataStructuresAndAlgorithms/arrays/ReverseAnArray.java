package dataStructuresAndAlgorithms.arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public int[] reverseAnArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {

        ReverseAnArray reverse = new ReverseAnArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(reverse.reverseAnArray(arr)));
    }
}
