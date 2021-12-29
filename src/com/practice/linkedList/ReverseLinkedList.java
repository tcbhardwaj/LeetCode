package com.practice.linkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode p = head.next;
        ListNode t = null;
        ListNode q = head;
        q.next = null;
        while(p != null) {
            t = q;
            q = p;
            p = p.next;
            q.next = t;
        }
        return q;
    }
}
