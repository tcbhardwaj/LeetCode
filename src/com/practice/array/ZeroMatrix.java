package com.practice.array;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,0,4}
            };

        setZeroes(matrix);
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;

        for(int i = 0; i < row; i++) {
            if(matrix[i][0] == 0) {
                isFirstColZero = true;
                break;
            }
        }
        for(int i = 0; i < col; i++) {
            if(matrix[0][i] == 0) {
                isFirstRowZero = true;
                break;
            }
        }

        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < row; i++) {
            if(matrix[i][0] == 0) {
                for(int j = 1; j < col; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = 1; i < col; i++) {
            if(matrix[0][i] == 0) {
                for(int j = 1; j < row; j++){
                    matrix[j][i] = 0;
                }
            }
        }


        if(isFirstRowZero) {
            for(int j = 0; j < col; j++){
                matrix[0][j] = 0;
            }
        }


        if(isFirstColZero) {
            for(int j = 0; j < row; j++){
                matrix[j][0] = 0;
            }
        }

    }
}
