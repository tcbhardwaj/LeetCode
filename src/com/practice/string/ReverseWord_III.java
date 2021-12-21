package com.practice.string;

public class ReverseWord_III {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] input = s.split(" ");
        StringBuilder result = new StringBuilder("");
        for(int i = 0; i < input.length; i++) {
            result = result.append(reverse(input[i])).append(" ");
        }
        return result.toString().trim();
    }

    private static String reverse(String input) {
        char[] s = input.toCharArray();
        int left = 0;
        int right = s.length-1;
        while(left < right) {
            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;
            left++;
            right--;
        }
        return String.valueOf(s);
    }
}
