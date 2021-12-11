package com.practice.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int count = 0;
        int j = 0;
        boolean loopBreak = false;
        strs = Arrays.stream(strs).sorted(Comparator.comparing(String::length)).toArray(String[]::new);
        while(j < strs[0].length()) {
            for (int i = 1; i < strs.length; i++) {
                char c = strs[0].charAt(j);
                if ( c != strs[i].charAt(j)) {
                    loopBreak = true;
                    break;
                }
            }
            if(loopBreak) {
                break;
            }
            j++;
            count++;
        }
        return strs[0].substring(0, count);
    }

    public static void main(String[] args) {
        String[] input = {"reflower","flow","flight"};
//        List<String> s = Arrays.stream(input).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
//        System.out.println(s);
        System.out.println(longestCommonPrefix(input));
    }
}
