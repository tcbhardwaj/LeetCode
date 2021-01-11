package com.practice;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String s = "Marge, let's \"[went].\" I await {news} telegram.";
        boolean result = isPalindrome(s);
//        char c = '9';
        System.out.println(result);
    }
    public static boolean isPalindrome(String s) {
        if(s.equals("")) {
            return true;
        }
        s = s.toLowerCase();
        char[] text = s.toCharArray();
        int left = 0;
        int right = text.length-1;
        while(left <= right) {
            char ch = text[left];
            if(!((ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57))){
                left++;
                continue;
            }
            ch = text[right];
            if(!((ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57))){
                right--;
                continue;
            }
            if(text[left] != text[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
