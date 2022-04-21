package com.practice.array;

import java.util.Stack;

public class _946_ValidateStackSequence {
    public static void main(String[] args) {
        System.out.println(validateStackSequences(new int[]{2,1,3,0}, new int[]{1,0,3,2}));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while(!stack.isEmpty() && j < pushed.length && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        return j == pushed.length;
    }
}
