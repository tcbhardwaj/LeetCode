package com.practice.array;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_II {
    public static List<Integer> getRow(int rowIndex) {
        int val = 1;
        long factor = 1;
        List<Integer> result = new ArrayList<>();
        for(int j = 0; j <= rowIndex; j++) {
            result.add(val);
            factor = factor * (rowIndex-j);
            factor = factor / (j+1);
            val = (int) factor;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getRow(30));
    }
}
