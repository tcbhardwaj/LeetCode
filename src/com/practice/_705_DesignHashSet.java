package com.practice;

public class _705_DesignHashSet {
    boolean[] hashSet;
    public _705_DesignHashSet() {
        hashSet = new boolean[1000000];
    }

    public void add(int key) {
        hashSet[key] = true;
    }

    public void remove(int key) {
        hashSet[key] = false;
    }

    public boolean contains(int key) {
        return hashSet[key];
    }
}
