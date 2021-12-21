package com.practice.array;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        long start = System.currentTimeMillis();
        System.out.println(rob(nums));
        System.out.println("Executed in: " + (System.currentTimeMillis() - start));
    }
    public static int rob(int[] nums) {
        int result=0;
        int i =0;
        int j = 1;
        int sumEven = 0;
        int sumOdd = 0;
        while(i < nums.length || j < nums.length) {
            if(i < nums.length) {
                sumEven += nums[i];
            }
            if(j < nums.length) {
                sumOdd += nums[j];
            }
            i += 2;
            j += 2;
        }
        if(sumOdd > sumEven) {
            return sumOdd;
        } else {
            return sumEven;
        }

    }
}
