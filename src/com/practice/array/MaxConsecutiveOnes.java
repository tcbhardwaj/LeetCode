package com.practice.array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
            } else {
                count = 0;
            }
            if(count > maxOnes) {
                maxOnes = count;
            }
        }

        return maxOnes;
    }
}
