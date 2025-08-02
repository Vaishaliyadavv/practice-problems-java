package dataStructuresAndAlgorithms.recursion;

//https://www.geeksforgeeks.org/problems/reverse-an-array/0

public class GFGReverseAnArray {
    public static void reverse(int i, int[] arr, int n) {
        if (i >= n / 2) return;
        swap(arr, i, n - i - 1);
        reverse(i + 1, arr, n);
    }
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public void reverseArray(int[] arr) {
        reverse(0, arr, arr.length);
    }
}
