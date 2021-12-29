package com.practice.string;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] tArr = t.toCharArray();
        char[] sArr = s.toCharArray();
        if(tArr.length > sArr.length){
            return false;
        }
        Arrays.sort(tArr);
        Arrays.sort(sArr);
        int i = 0;
        while(i < tArr.length) {
            if(tArr[i] != sArr[i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
