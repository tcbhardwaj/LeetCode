package com.practice.string;
/**
 * return true if ransomNote can be constructed from magazine and false otherwise.
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class RansomNote {
    public static void main(String[] args) {

        System.out.println(canConstruct("aa", "ab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomChars = ransomNote.toCharArray();
        StringBuilder magazineBuilder = new StringBuilder(magazine);
        if(ransomNote.length() > magazine.length()) {
            return false;
        }
        for (int i = 0; i < ransomChars.length; i++) {
            int index = magazineBuilder.indexOf(String.valueOf(ransomChars[i]));
            if(index >= 0) {
                magazineBuilder.setCharAt(index, '$');
            } else {
                return false;
            }
        }
        return true;
    }
}
