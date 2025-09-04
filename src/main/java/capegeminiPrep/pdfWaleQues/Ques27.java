package capegeminiPrep.pdfWaleQues;

import static dataStructuresAndAlgorithms.recursion.GFGReverseAnArray.swap;


public class Ques27 {
    public static void swap(){

    }
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            int start = 0;
            int end = n-1;

            while(start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        Ques27 obj = new Ques27();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        obj.rotate(matrix);

        // Print rotated matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
