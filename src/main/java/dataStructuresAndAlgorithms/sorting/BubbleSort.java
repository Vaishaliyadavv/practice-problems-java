package dataStructuresAndAlgorithms.sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        // code here
        int n = arr.length;
        for (int i = n - 1; i >= 1; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 46, 24, 52, 20, 13};
        bubbleSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
