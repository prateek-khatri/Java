/*29. Given a binary tree, find the lowest common ancestor (LCA)
 *  of two given nodes in the tree.

According to the definition of LCA on Wikipedia: 
“The lowest common ancestor is defined between two nodes v and
 w as the lowest node in T that has both v and w as descendants
  (where we allow a node to be a descendant of itself).”

        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6      _2       0       8
         /  \
         7   4
For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3. 
Another example is LCA of nodes 5 and 4 is 5, 
since a node can be a descendant of itself according to the LCA definition.


*/
package com.pack.java;

import java.util.ArrayList;


public class BTRightPointer {
	public static void main(String[] args) {
		BTRightPointer prog = new BTRightPointer();
		prog.run();
	}
	public void run() {
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		for (int i = 0; i <=8; i++) {
	//initializes the tree link node with 1
			TreeNode n = new TreeNode(i);
			list.add(n);
		}
		list.get(3).left = list.get(5);
		list.get(3).right = list.get(1);
		list.get(5).left = list.get(6);
		list.get(5).right = list.get(2);
		list.get(2).left = list.get(7);
		list.get(2).right = list.get(4);
		list.get(1).right = list.get(8);
		list.get(1).left = list.get(0);
	Solutions sol = new Solutions();
		
		TreeNode lca=sol.lowestCommonAncestor(list.get(3),list.get(5),list.get(4));
	System.out.println(lca.val);
		//printTree(list.get(0));
	}
	


 /*	public void printTree(TreeNode root) {
		TreeNode currHead = root;
		while (currHead != null) {
			TreeNode curr = currHead;
			while (curr != null) {
				System.out.print(curr.val+", ");
				curr = curr.next;
			}
			System.out.print("#, ");
			currHead = currHead.left;
		}
	}*/
}
	


