package com.practice.string;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {
        String[] input = s.split(" ");
        StringBuilder result = new StringBuilder("");
        for(int i = input.length-1; i >= 0; i--) {
            if(!input[i].isEmpty()) {
                result = result.append(input[i]).append(" ");
            }
        }

        return result.toString().trim();

    }
}
