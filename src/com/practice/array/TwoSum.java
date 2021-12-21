package com.practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number.
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 *
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 *
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        long start = System.currentTimeMillis();
        Arrays.stream(ans).forEach(System.out::println);
        long timeTaken = System.currentTimeMillis() - start;
        System.out.println("Completed in: " + timeTaken + " Milisec");

    }

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> lookup = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i < numbers.length; i++) {
            int delta = target - numbers[i];
            if(lookup.get(delta) != null) {
                ans[0] = lookup.get(delta)+1;
                ans[1] = i+1;
                break;
            }
            lookup.put(numbers[i], i);
        }

        return ans;
    }
}
