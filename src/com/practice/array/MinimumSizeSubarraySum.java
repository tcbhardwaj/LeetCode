package com.practice.array;

import java.util.Arrays;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;
        for(int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while(sum >= target && start <= end) {
                minLength = Math.min(minLength, end - start +1);
                sum -= nums[start++];
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,4};
        int target = 4;
        System.out.println(minSubArrayLen(target, nums));
    }
}
