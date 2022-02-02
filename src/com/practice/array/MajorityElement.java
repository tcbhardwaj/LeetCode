package com.practice.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int num : nums) {
            int value = map.get(num) != null ? map.get(num) + 1 : 1;
            map.put(num, value);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int value = e.getValue();
            if(value > nums.length/2){
                result =  e.getKey();
                break;
            }
        }
        return result;
    }
}
