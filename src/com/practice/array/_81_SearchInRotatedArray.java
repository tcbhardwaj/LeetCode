package com.practice.array;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

public class _81_SearchInRotatedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3));
    }

    public static boolean search(int[] nums, int target) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, true);
        }
        return map.getOrDefault(target, false);
    }
}
