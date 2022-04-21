package com.practice.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _6_ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(convert2("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if(numRows < 2) {
            return s;
        }
        List<List<Character>> arr = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            arr.add(i, new ArrayList<>());
        }
        StringBuilder ans = new StringBuilder();
        int j = 0;
        int count = 0;
        while(count < s.length()) {

            for(int i = 0; i < numRows && count < s.length(); i++) {
                arr.get(i).add(s.charAt(count));
                count++;
            }
            j++;
            for(int i = numRows-2; i > 0 && count < s.length() ; i--) {
                arr.get(i).add(s.charAt(count));
                count++;
            }
        }

        for (int i = 0; i < arr.size() ; i++) {
            ans = ans.append(arr.get(i).stream().map(String::valueOf).collect(Collectors.joining()));
        }

        return ans.toString();
    }

    public static String convert2(String s, int numRows) {
        if(numRows < 2) {
            return s;
        }
        int i = 0, count=0;
        boolean down = true;
        List<List<Character>> list = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        for (int j = 0; j < numRows; j++) {
            list.add(j, new ArrayList<>());
        }
        while (count < s.length()) {
            list.get(i).add(s.charAt(count++));
            if(down) {
                i++;
            } else {
                i--;
            }
            if(i == numRows-1){
                down = false;
            } else if( i == 0) {
                down = true;
            }
        }
        for (int k = 0; k < list.size() ; k++) {
            ans = ans.append(list.get(k).stream().map(String::valueOf).collect(Collectors.joining()));
        }

        return ans.toString();
    }
}
