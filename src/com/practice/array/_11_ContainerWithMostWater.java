package com.practice.array;

public class _11_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] a = {1,1};
        System.out.println(maxArea(a));
    }

    public static int maxArea(int[] height) {
        int maxWater = 0;
        int i = 0;
        int j = height.length-1;

        while(i < j) {
            int max;
            if(height[i] < height[j]) {
                max = height[i] * (j-i);
                i++;
            } else {
                max = height[j] * (j-i);
                j--;
            }
            if(max > maxWater){
                maxWater = max;
            }
        }

        return maxWater;
    }
}
