package com.practice.tree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listOflist = new ArrayList<>();
        inorder(root, 0, listOflist);
        return listOflist;
    }

    public void inorder(TreeNode root, int level, List<List<Integer>> listOflist ){
        if(root == null) return;
        if(listOflist.size() >= level +1){
            listOflist.get(level).add(root.val);
        }
        else if(listOflist.size() == level) {
            listOflist.add(new ArrayList<Integer>());
            listOflist.get(level).add(root.val);
        }
        inorder(root.left, level +1, listOflist);
        inorder(root.right, level +1, listOflist);
    }
}
