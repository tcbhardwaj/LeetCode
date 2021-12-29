package com.practice.linkedList;

public class RemoveElement {
    public static void main(String[] args) {

    }

    public static ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return head;
        }
        if(head.val == val) {
            head = head.next;
        }
        while(head != null && head.val == val) {
            head = head.next;
        }
        ListNode p = head;
        ListNode q = null;
        while(p != null) {
            if(p.val == val) {
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
