package com.practice.linkedList;

public class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode createNode(int data){
        ListNode node = new ListNode(data);

        return node;
    }

    public ListNode append(int data) throws Exception {
        if(this == null)
            throw new Exception("Head is null");

        ListNode p = this;
        while(p.next != null) {
            p = p.next;
        }
        p.next = createNode(data);
        return this;
    }

    public ListNode append(ListNode node) throws Exception {
        if(this == null)
            throw new Exception("Head is null");

        ListNode p = this;
        while(p.next != null) {
            p = p.next;
        }
        p.next = node;
        return this;
    }

    public void display() {
        ListNode p = this;
        System.out.println();
        while(p != null) {
            System.out.print(p.val +" -> ");
            p = p.next;
        }
    }
}
