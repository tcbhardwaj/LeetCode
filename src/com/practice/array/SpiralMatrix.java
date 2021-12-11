package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {

        int minr = 0;
        int minc = 0;
        int maxr = matrix.length - 1;
        int maxc = matrix[0].length - 1;
        List<Integer> result = new ArrayList<>();
        int totalElements = matrix.length * matrix[0].length;
        int counter = 0;
        while(counter < totalElements) {
            for(int j = minc, i = minr; j <= maxc && counter < totalElements; j++) {
                result.add(matrix[i][j]);
                counter++;
            }
            minr++;
            for(int i = minr, j = maxc; i <= maxr && counter < totalElements; i++) {
                result.add(matrix[i][j]);
                counter++;
            }
            maxc--;
            for(int j = maxc, i = maxr; j >= minc && counter < totalElements; j--) {
                result.add(matrix[i][j]);
                counter++;
            }
            maxr--;
            for(int i = maxr, j = minc; i >= minr && counter < totalElements; i--) {
                result.add(matrix[i][j]);
                counter++;
            }
            minc++;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(spiralOrder(mat));
    }

}
