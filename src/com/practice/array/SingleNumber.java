package com.practice.array;

import java.util.Arrays;

public class SingleNumber {
//  {1,1,2,2,4}
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 2) {
            return nums[0];
        }
        if(nums[0] != nums[1]) {
            return nums[0];
        }
        int result = nums[0];
        boolean found = false;
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i-1] != nums[i] && nums[i] != nums[i+1]){
                result = nums[i];
                found = true;
                break;
            }
        }
        if(!found){
            return nums[nums.length-1];
        }
        return result;
    }
}
