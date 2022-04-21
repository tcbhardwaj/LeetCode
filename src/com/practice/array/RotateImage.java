package com.practice.array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

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

    public static void main(String[] args) throws ParseException {

//        int[][] matrix = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        rotate(matrix);
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("0001-01-01 00:00:00");
        System.out.println(date);
    }
}
