package dataStructuresAndAlgorithms.arrays;

public class RemoveEvenNum {
     public int[] removeEvenNum(int[] arr) {
         int oddCount = 0;
         for (int j : arr) {
             if (j % 2 == 0) {
                 oddCount++;
             }
         }
         int[] result = new int[oddCount];
         int idx = 0;
         for (int j : arr) {
             if (j % 2 != 0) {
                 result[idx++] = j;
             }
         }
         return result;
     }
     public static void printArray(int[] arr) {
         for (int j : arr) {
             System.out.print(j + " ");
         }
     }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        RemoveEvenNum removeEvenNum = new RemoveEvenNum();
        printArray(removeEvenNum.removeEvenNum(arr));
    }
}
