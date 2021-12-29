package com.practice.linkedList;

import java.util.Stack;

public class ValidateParantheses {
    public static void main(String[] args) {
        System.out.println(isValid("((())[]"));
    }

    public static boolean isValid(String s) {
        char[] input = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean result = true;
        for (int i = 0; i < input.length; i++) {
            if(input[i] == ')' || input[i] == '}' || input[i] == ']') {
                if(stack.isEmpty()){
                    result = false;
                    break;
                }
                char st = stack.pop();
                char in = input[i];
                if(st == '(' && in != ')') {
                    result = false;
                    break;
                } else if( st == '{' && in != '}') {
                    result = false;
                    break;
                } else if( st == '[' && in != ']') {
                    result = false;
                    break;
                }
            } else {
                stack.push(input[i]);
            }
        }
        if(!stack.isEmpty()){
            return false;
        }

        return result;
    }
}
