package com.practice.string;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = "hello".toCharArray();
        int left = 0;
        int right = s.length-1;
        int mid = (int)s.length/2;
        while(left < mid) {
            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;
            left++;
            right--;
        }
    }
}
