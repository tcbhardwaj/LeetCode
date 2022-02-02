package com.practice.array;

public class RotateImage {

    public static void rotate(int[][] matrix) {
        //transpose of matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i+1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse each row in matrix
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            int j = 0;
            int k = row.length-1;
            while(j < k) {
                int temp = row[j];
                row[j] = row[k];
                row[k] = temp;
                j++;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
