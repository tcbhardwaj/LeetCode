package com.practice.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _1046_LastStoneWeight {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[] {1}));
    }

    public static int lastStoneWeight(int[] stones) {
        int x;
        int y;
        if(stones.length == 1) {
            return stones[0];
        }
        stones = Arrays.stream(stones).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        while(true) {
            y = stones[0];
            x = stones[1];
            if( y == -1) {
                return 0;
            }
            if(x == -1) {
                return y;
            }
            if(x == y){
                stones[0] = -1;
                stones[1] = -1;
            } else if(x < y) {
                stones[1] = -1;
                stones[0] = y-x;
            }
            stones = Arrays.stream(stones).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        }
    }
}
