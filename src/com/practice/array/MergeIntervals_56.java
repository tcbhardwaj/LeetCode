package com.practice.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeIntervals_56 {
    public static void main(String[] args) {
        int[][] intervals = {{1,6}, {2,5}, {8,10}, {10,18}};
        System.out.println(merge(intervals));
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> stack = new Stack<>();
        stack.push(intervals[0]);
        for(int i = 1; i < intervals.length; i++) {
            int[] stackIntervel = stack.peek();
            int[] data = intervals[i];
            if(stackIntervel[1] >= data[0]) {
                stackIntervel[1] = stackIntervel[1] > data[1] ? stackIntervel[1] : data [1];
                stack.pop();
                stack.push(stackIntervel);
            } else {
                stack.push(data);
            }

        }
        int[][] result = new int[stack.size()][2];
        int i = 0;
        while (!stack.isEmpty()) {
            int[] x = stack.pop();
            result[i][0] = x[0];
            result[i][1] = x[1];
            i++;
        }
//        result = stack.stream().map(value -> Arrays.stream(value).flatMap());
        return result;
    }
}
