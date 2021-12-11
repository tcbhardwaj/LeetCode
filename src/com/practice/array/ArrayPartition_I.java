package com.practice.array;

import java.util.Arrays;

/**
 * Given an integer array nums of 2n integers,
 * group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn)
 * such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
 */
public class ArrayPartition_I {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        long start = System.currentTimeMillis();
        System.out.println(arrayPairSum(nums));
        long time = System.currentTimeMillis() - start;
        System.out.println("executed in: " + time);

    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int minsum = 0;
        int i = 0;
        int j = nums.length-1;
        while(j-i > 1) {
            if(nums[i] < nums[i+1]) {
                minsum += nums[i];
            } else {
                minsum += nums[i+1];
            }

            if(nums[j] < nums[j-1]) {
                minsum += nums[j];
            } else {
                minsum += nums[j-1];
            }
            i = i+2;
            j = j-2;
        }
        if((nums.length / 2) % 2 == 1) {
            if (nums[i] < nums[i + 1]) {
                minsum += nums[i];
            } else {
                minsum += nums[i + 1];
            }
        }
//        for(int i = 0; i < nums.length - 1; i=i+2) {
//            if(nums[i] < nums[i+1]) {
//                minsum += nums[i];
//            } else {
//                minsum += nums[i+1];
//            }
//        }
        return minsum;

    }
}
