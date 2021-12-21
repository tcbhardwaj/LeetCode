package com.practice.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(i -> System.out.print(i +" "));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0; i < nums1.length; i++) {
            nums1[i] = nums2[j++];
        }

        Arrays.sort(nums1);
    }
}
