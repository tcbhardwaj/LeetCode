package com.practice.linkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static void main(String[] args) {

    }

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while(head != null){
            if(!nodeSet.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
