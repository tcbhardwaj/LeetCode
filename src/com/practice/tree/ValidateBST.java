package com.practice.tree;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null ) {
            return true;
        }
        boolean flag = false;
        if(root.left == null && root.right != null && root.right.val > root.val) {
            flag = true;
        } else if(root.right == null && root.left != null && root.left.val < root.val) {
            flag = true;
        } else if(root.right != null && root.left != null && root.right.val > root.val && root.left.val < root.val) {
            flag = true;
        }

        return flag && isValidBST(root.left) && isValidBST(root.right);
    }
}
