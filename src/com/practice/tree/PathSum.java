package com.practice.tree;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        /*
		do travel from root-left-right, reduce value of target from every previously visited parent node.
		*/


        //check present node value subtraction with target value leads to zero.
        //also check whether this node is leaf or not.
        if(root!=null&&root.left==null&&root.right==null&&targetSum-root.val==0)
            return true;
        else
        if(root==null)
            return false;


        //keep left side traversal track
        boolean left = hasPathSum(root.left,targetSum-root.val);
        //keep right side traversal track
        boolean right = hasPathSum(root.right,targetSum-root.val);


        //atleast one of the root-leaf chain traversal should lead to target sum.
        return left||right;
    }
}
