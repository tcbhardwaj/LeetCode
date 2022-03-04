package com.practice.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
    }

    public static int lengthOfLongestSubstring(String s) {
//        if(s.length() == 0 || s.length() == 1){
//            return s.length();
//        }
        int result = 0;
        int i = -1;
        int j = -1;
        Map<Character, Integer> map = new HashMap<>();
        while (true) {
            boolean f1 = false;
            boolean f2 = false;
//        acquire
            while (i < s.length()-1) {
                i++;
                f1 = true;
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if (map.get(ch) == 2) {
                    break;
                } else {
                    int len = i - j;
                    if (len > result) {
                        result = len;
                    }
                }
            }
//        release
            while (j < i) {
                j++;
                f2 = true;
                char ch = s.charAt(j);
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 1) {
                    break;
                }

            }

            if(!f1 && !f2) {
                break;
            }
        }

        return result;
    }
}
