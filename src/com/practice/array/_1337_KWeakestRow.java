package com.practice.array;

import java.util.Arrays;
import java.util.Comparator;

public class _1337_KWeakestRow {
    public static void main(String[] args) {
        int[] result = kWeakestRows(new int[][] {{1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}}, 3);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        int[][] rowSoldier = new int[mat.length][2];

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                count = count + mat[i][j];
            }
            rowSoldier[i][0] = i;
            rowSoldier[i][1] = count;
        }

        Arrays.sort(rowSoldier, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(rowSoldier, Comparator.comparingInt(a -> a[1]));

        for (int i = 0; i < k; i++) {
            result[i] =  rowSoldier[i][0];
        }
        return result;
    }
}
