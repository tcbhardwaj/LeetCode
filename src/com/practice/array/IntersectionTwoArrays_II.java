package com.practice.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionTwoArrays_II {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersect(nums1, nums2);
        Arrays.stream(result).forEach(i -> System.out.print(i + ","));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        Arrays.stream(nums1).forEach(item1 -> {
            if(list2.contains(item1)) {
                result.add(item1);
                int i = list2.indexOf(item1);
                list2.remove(i);
            }
        });
       return result.stream().mapToInt(i -> i).toArray();
    }
}
