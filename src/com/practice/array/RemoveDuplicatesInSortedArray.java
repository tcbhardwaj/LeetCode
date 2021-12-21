package com.practice.array;

public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while( j < nums.length) {
            if(nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++;
            }
            j++;
        }
        return i+1;
    }
}
