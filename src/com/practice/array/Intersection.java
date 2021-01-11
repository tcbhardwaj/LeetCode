package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = new int[] {4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        int[] result = intersect(nums1, nums2);
        System.out.print("[");
        for(int i = 0; i< result.length; i++){
            System.out.print(result[i]+",");
        }
        System.out.print("]");
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
            for(int i = 0; i < nums1.length; i++) {
                for(int j = 0; j < nums2.length; j++){
                    if(nums1[i] == nums2[j]){
                        result.add(nums2[j]);
                        nums2[j] = -1;
                        break;
                    }
                }
            }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
