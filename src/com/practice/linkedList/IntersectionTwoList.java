package com.practice.linkedList;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoList {

    public static void main(String[] args) throws Exception {

        ListNode list = new ListNode(1).append(2).append(3).append(4).append(5);

        Set<ListNode> nodeSet = new HashSet<>();

        while(list != null){
            if(!nodeSet.add(list)){
                System.out.println(list.val);
            }
            list = list.next;
        }

    }
}
