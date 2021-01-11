package com.practice;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] inputArr = input.toCharArray();
        int i=0;
        String output = "";
        while(i < inputArr.length) {
            char c = inputArr[i];
            if(c == '.') {
              output = output.concat("0");
            }else {
                char first = inputArr[i];
                char second = inputArr[++i];
                String x = getCode(first, second);
                output+=x;
            }
            i++;
        }

        System.out.println(output);
    }

    private static String getCode(char first, char second) {
        String value ="";
        if(String.valueOf(first).equals("-")) {
            if(String.valueOf(second).equals("-")) {
                value = "2";
            } else {
                value = "1";
            }
        }
        return value;
    }
}
