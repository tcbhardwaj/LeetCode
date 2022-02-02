package com.practice.array;

import java.util.Arrays;
import java.util.List;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 */
public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int[] input = new int[matrix.length * matrix[0].length];
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                input[k++] = matrix[i][j];
            }
        }

        int l = 0;
        int u = input.length-1;
        while(l <= u) {
            int m = (l+u)/2;
            if(input[m] == target) {
                return true;
            }
            if(target > input[m]) {
                l = m+1;
            } else if(target < input[m]) {
                u = m-1;
            }
        }
        return false;
    }
}
