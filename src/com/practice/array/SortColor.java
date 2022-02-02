package com.practice.array;

public class SortColor {
    public static void main(String[] args) {
        int[] nums = {0,0,2,1,0,2};
//        quickSort(nums, 0, 5);
        sortColors2(nums);
        System.out.println(nums);
    }

    public static void sortColors2(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zeroCount++;
            } else if( nums[i] == 1) {
                oneCount++;
            } else {
                twoCount++;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(i < zeroCount) {
                nums[i] = 0;
            } else if( i <  zeroCount + oneCount ) {
                nums[i] = 1;
            } else if(i < zeroCount + oneCount + twoCount) {
                nums[i] = 2;
            }
        }
    }

    public void sortColors(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] nums, int start, int end) {
        int pivot = nums[start];
        int low = start+1;
        int upper = end;
        while(low < upper) {
            while(nums[low] < pivot)
                low++;
            while(nums[upper] > pivot)
                upper--;
            swap(nums, low, upper);
            low++;
            upper--;

        }
        swap(nums, start, upper);

        return upper+1;
    }

    public static void quickSort(int[] nums, int start, int end) {
        int m = partition(nums, start, end);
        quickSort(nums, start, m-1);
        quickSort(nums, m+1, end);
    }
}
