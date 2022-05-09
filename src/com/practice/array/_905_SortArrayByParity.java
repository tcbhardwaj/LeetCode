package com.practice.array;

public class _905_SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = sortArrayByParity(new int[] {0, 2});
        for (int n : nums){
            System.out.print(n + ", ");
        }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while ( i < j) {
            while(i < j && nums[i] % 2 == 0){
                i++;
            }
            while(i < j && nums[j] % 2 == 1) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
}
