package com.practice.tree;

import java.util.Scanner;

public class BinaryTree {
    Node root = null;

    public Node createBinaryTree() {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        Node node = new Node(val);
        if(root == null) {
            root = node;
        } else {

        }

        return node;
    }

}
