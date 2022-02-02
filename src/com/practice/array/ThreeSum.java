package com.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if(i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int newTarget = 0-nums[i];
            List<List<Integer>> subRes = twoSum(nums, i+1, nums.length-1, newTarget);
            for (List<Integer> list: subRes) {
                list.add(nums[i]);
                res.add(list);
            }
        }

        return res;
    }

    private static List<List<Integer>> twoSum(int[] nums, int si, int ei, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int left = si;
        int right = ei;
        while(left < right) {
            if(left != si && nums[left] == nums[left-1]) {
                left++;
                continue;
            }
            int sum = nums[left] + nums[right];
            if(sum == target) {
                List<Integer> subRes = new ArrayList<>();
                subRes.add(nums[left]);
                subRes.add(nums[right]);
                res.add(subRes);
                left++;
                right--;
            } else if( sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return res;
    }
}
