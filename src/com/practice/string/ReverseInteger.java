package com.practice.string;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
//        int x = -123;
        String newn = "0";
        int multiplayer = x >= 0 ? 1 : -1;
        x = x * multiplayer;
        while(x != 0) {
            int rem = x%10;
            x = x/10;
            newn += rem ;
        }

        int result = 0;
        try{
            result = multiplayer * Integer.parseInt(newn);
        }catch (NumberFormatException e){
            //x = 0;
        }
        System.out.println(result);
    }
}
