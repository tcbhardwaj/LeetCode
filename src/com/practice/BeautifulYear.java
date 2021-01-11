package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intVaue = sc.nextInt();
        int newBeautifulYear = 0;
        while(true){
            String input = String.valueOf(++intVaue);
            String[] inputArr = input.split("");
            Set<String> yearSet = new HashSet<>(Arrays.asList(inputArr));
            if(yearSet.size() == inputArr.length) {
                newBeautifulYear = intVaue;
                break;
            }
        }

        System.out.println(newBeautifulYear);

    }
}
