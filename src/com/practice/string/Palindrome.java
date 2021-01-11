package com.practice.string;
/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
Note: For the purpose of this problem, we define empty string as valid palindrome.

Input: "A man, a plan, a canal: Panama"
Output: true

Input: "race a car"
Output: false
 */
public class Palindrome {
    public static void main(String[] args) {
        String s = "Marge, let's \"[went].\" I await {news} telegram.";
        boolean result = isPalindrome(s);
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
