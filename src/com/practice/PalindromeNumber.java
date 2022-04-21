package com.practice;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        int num = x;
        int palindrom = 0;
        while(num > 0) {
            int rem = num % 10;
            num = num / 10;
            palindrom = palindrom * 10 + rem;
        }

        if(palindrom == x)
            return true;
        else
            return false;
    }
}
