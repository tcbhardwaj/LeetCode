package com.practice.array;

public class MovesZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(nums);

    }

    public static void moveZeroes(int[] nums) {
        int i = 0;

        while(i < nums.length) {
            if(nums[i] == 0) {
                int j = i+1;
                while(nums[j] != 0 && j < nums.length-1){
                    j++;
                }
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
            i++;
        }
    }
}
