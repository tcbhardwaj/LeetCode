package com.practice.linkedList;

public class DesignHashMap {
    private int size = 500;
    Node[] nodeHeads = new Node[size];
    private class Node {
        int key;
        int value;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public DesignHashMap() {
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node temp = nodeHeads[index];
        if(temp == null) {
            nodeHeads[index] = new Node(key, value);
            return;
        }
        Node p = temp;
        while(temp != null) {
            if(temp.key == key) {
                temp.value = value;
                return;
            }
            p = temp;
            temp = temp.next;
        }
        p.next = new Node(key, value);
    }

    public int get(int key) {
        int index = hash(key);
        Node temp = nodeHeads[index];
        while(temp != null) {
            if(temp.key == key) {
                return temp.value;
            }
            temp = temp.next;
        }

        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Node temp = nodeHeads[index];
        if(temp == null) {
            return;
        }
        if(temp.key == key) {
            nodeHeads[index] = nodeHeads[index].next;
            return;
        }
        while(temp.next != null) {
            if(temp.next.key == key) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    private int hash(int key){
        return key % size;
    }
}
