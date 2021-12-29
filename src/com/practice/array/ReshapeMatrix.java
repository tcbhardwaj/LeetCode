package com.practice.array;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2}, {3,4},{5,6}};
        int r = 2;
        int c = 3;
        int[][] result = matrixReshape(mat,r,c);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c) {
            return mat;
        }
        int[][] result = new int[r][c];
        int x = 0;
        int y = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                result[x][y++] = mat[i][j];
                if(y == c) {
                    y = 0;
                    x++;
                }
            }
        }

        return result;
    }
}
