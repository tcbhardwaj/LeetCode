package com.practice.linkedList;
/**
 * Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list. Return the linked list sorted as well.
 */

import com.practice.tree.Node;

import java.util.HashSet;
import java.util.Set;

public class _82_RemoveDuplicateII {
    public static void main(String[] args) {
        Node p = new Node();
        System.out.println(p.toString());
    }
    public static ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode p = head;
        ListNode q = null;
        while (p != null) {
            if (!set.add(p.val)) {
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
