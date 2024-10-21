package dataStructuresAndAlgorithms.arrays;

public class AddOrUpdate {
     public static void main(String[] args) {
          AddOrUpdate add = new AddOrUpdate();
          add.arrayDemo();
     }
     public void arrayDemo() {
          int[] arr = new int[5];
          arr[0] = 1;
          arr[1] = 2;
          arr[2] = 3;
          arr[3] = 4;
          arr[4] = 5;
          printArray(arr);
     }
     public void printArray(int[] arr) {
         for (int j : arr) {
             System.out.print(j + " ");
         }
     }
}
