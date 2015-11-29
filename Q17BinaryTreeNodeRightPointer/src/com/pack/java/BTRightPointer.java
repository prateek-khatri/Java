/*17. Follow up for problem "Populating Next Right Pointers in Each Node".
What if the given tree could be any binary tree? Would your previous solution still work?
Note:
You may only use constant extra space.
For example,
Given the following binary tree,
   1
       /  \
      2    3
     / \    \
    4   5    7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \    \
    4-> 5 -> 7 -> NULL


*/
package com.pack.java;

import java.util.ArrayList;


public class BTRightPointer {
	public static void main(String[] args) {
		BTRightPointer prog = new BTRightPointer();
		prog.run();
	}
	public void run() {
		ArrayList<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
		for (int i = 0; i < 8; i++) {
	//initializes the tree link node with 1
			TreeLinkNode n = new TreeLinkNode(i+1);
			list.add(n);
		}
		list.get(0).left = list.get(1);
		list.get(0).right = list.get(2);
		list.get(1).left = list.get(3);
		list.get(1).right = list.get(4);
		list.get(2).right = list.get(5);
		list.get(3).left = list.get(6);
		list.get(5).right = list.get(7);
		connect(list.get(0));
		printTree(list.get(0));
	}
	
	//based on level order traversal
    public void connect(TreeLinkNode root) {

        TreeLinkNode head = null; //head of the next level
        TreeLinkNode prev = null; //the leading node on the next level
        TreeLinkNode cur = root;  //current node of current level

        while (cur != null) {

            while (cur != null) { //iterate on the current level
                //left child
            	//prev has value of  left
                if (cur.left != null) {
                    if (prev != null) {
                        prev.next = cur.left;
                    } else {
                        head = cur.left;
                    }
                    prev = cur.left;
                }
                //right child
                //prev.next value
                if (cur.right != null) {
                    if (prev != null) {
                        prev.next = cur.right;
                    } else {
                        head = cur.right;
                    }
                    prev = cur.right;
                }
                //move to next node
                cur = cur.next;
            }

            //move to next level
            cur = head;
            head = null;
            prev = null;
        }

    }


  /*public void connect(TreeLinkNode root) {
      if (root == null) return;
      root.next = null;
      helper(root, root.right);
      helper(root, root.left);
  }*/
  
 /* public void helper(TreeLinkNode p, TreeLinkNode n) {
      if (n == null) return;
      if (p.right != null && p.right != n) {
          n.next = p.right;
      } else {
          TreeLinkNode curr = p.next;
					//System.out.println("start");
          while (curr != null) {
						//System.out.print(curr.val + "->");
              if (curr.left != null) {                        
                  n.next = curr.left;
                  break;
              } else if (curr.right != null) {
                  n.next = curr.right;
                  break;
              }
              curr = curr.next;
          }
					//System.out.println();
      }
      helper(n, n.right);
      helper(n, n.left);
  }
*/	public void printTree(TreeLinkNode root) {
		TreeLinkNode currHead = root;
		while (currHead != null) {
			TreeLinkNode curr = currHead;
			while (curr != null) {
				System.out.print(curr.val+", ");
				curr = curr.next;
			}
			System.out.print("#, ");
			currHead = currHead.left;
		}
	}
}
	


