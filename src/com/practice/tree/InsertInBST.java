package com.practice.tree;

public class InsertInBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val, null, null);
            return root;
        }
        TreeNode p = root;
        while(p != null) {
            if(p.left == null && val < p.val){
                p.left = new TreeNode(val);
                break;
            }
            if(p.right == null && val > p.val) {
                p.right = new TreeNode(val);
                break;
            }
            if(val > p.val){
                p = p.right;
            } else {
                p = p.left;
            }
        }
        return root;
    }
}
