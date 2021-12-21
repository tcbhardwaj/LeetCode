package com.practice.array;

import java.util.Arrays;

public class Rotate {
    public static void rotate(int[] nums, int k) {
        int low = 0;
        int up = nums.length - k -1;
        reverse(nums, low, up);
        low = nums.length - k;
        up = nums.length-1;
        reverse(nums, low, up);
        reverse(nums, 0, nums.length-1);

        Arrays.stream(nums).forEach(i -> System.out.print(i + " "));
    }

    public static void reverse(int[] nums, int low, int up) {
        while(low < up) {
            int temp = nums[low];
            nums[low] = nums[up];
            nums[up] = temp;
            low++;
            up--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        int k = 2;
        rotate(nums, k);
    }
}
