package com.practice.string;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));

    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        int result = -1;
        for(Map.Entry<Character, Integer> k : map.entrySet()) {
            if(k.getValue() == 1) {
                result =  s.indexOf(k.getKey());
                break;
            }
        }
        return result;
    }
}
