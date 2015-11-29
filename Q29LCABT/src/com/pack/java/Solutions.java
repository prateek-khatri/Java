package com.pack.java;

class Solutions{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //root is null or if any p or q is equal to root return root
    	if(root == null || root == p || root == q)  return root;
       //left of root and right of root
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //last condition for therecursion to end
        if(left != null && right != null)   return root;
        //leftis null condition
        return left != null ? left : right;
    }



}	