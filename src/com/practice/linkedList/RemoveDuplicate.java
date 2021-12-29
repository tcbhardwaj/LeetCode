package com.practice.linkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode p = head;
        ListNode q = null;
        while(p != null) {
            if(!set.add(p.val)) {
                q.next = p.next;
                p = p.next;
                continue;
            }
            q = p;
            p = p.next;
        }

        return head;
    }
}
