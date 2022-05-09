package com.practice.backtracking;

import java.util.*;

public class _17_LetterCombinationOfAPhone {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }


    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) {
            return new ArrayList<>();
        }
        Map<String, String> map = new HashMap<String, String>(){{
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }};

        List<String> result = new ArrayList<>();

        Queue<String> queue = new LinkedList<>();
        queue.add("");
        int length = digits.length();
        while(!queue.isEmpty()) {
            String fromQueue = queue.remove();

            if( fromQueue.length() == length) {
                result.add(fromQueue);
            } else {
                String fromMap = map.get(digits.charAt(fromQueue.length())+"");
                for (int j = 0; j < fromMap.length(); j++) {
                    queue.add(fromQueue + fromMap.charAt(j));
                }
            }
        }

        return result;
    }
}
