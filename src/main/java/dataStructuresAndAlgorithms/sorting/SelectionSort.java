package dataStructuresAndAlgorithms.sorting;

import dataStructuresAndAlgorithms.recursion.GFGReverseAnArray;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int minIndex = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            GFGReverseAnArray.swap(arr, minIndex, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 46, 24, 52, 20, 13};
        selectionSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
