package com.practice.linkedList;

import java.util.List;

public class OddEvenLinkedList {

    public static void main(String[] args) throws Exception{
        ListNode list = new ListNode(1).append(2).append(3).append(4).append(5);

        list = oddEvenList(list);
        list.display();
    }

    public static ListNode oddEvenList(ListNode head) {

        ListNode even = null;
        ListNode odd = null;
        ListNode evenLast = null;
        ListNode oddLast = null;
        if(head == null)
            return null;

        ListNode p = head;
        int i = 1;
        while(p != null) {
            if(i % 2 == 0){
                if(even == null){
                    even = p;
                } else {
                    evenLast.next = p;
                }
                evenLast = p;
            } else {
                if(odd == null) {
                    odd = p;
                } else {
                    oddLast.next = p;
                }
                oddLast = p;
            }
            p = p.next;
            i++;
        }

        if(evenLast != null)
            evenLast.next = null;
        oddLast.next = even;

        return odd;
    }
}
