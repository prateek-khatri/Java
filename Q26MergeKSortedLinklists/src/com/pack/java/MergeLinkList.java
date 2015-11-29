/*26. Merge k sorted linked lists and return it as one sorted list.
 *  Analyze and describe its complexity.

*/
package com.pack.java;

import java.util.ArrayList;


public class MergeLinkList {


	
public static void main(String[] args) {
	
	
        ListNode HeadNode = new ListNode(1);
        ListNode Node1 = new ListNode(2);
        ListNode Node2 = new ListNode(3);
        ListNode Node3 = new ListNode(4);
        ListNode TailNode = new ListNode(5);
        HeadNode.next = Node1;
        Node1.next = Node2;
        Node2.next = Node3;
        Node3.next = TailNode;
        TailNode.next = null;
        
        
        ListNode HeadNode2 = new ListNode(1);
        ListNode Node21 = new ListNode(2);
        ListNode Node22 = new ListNode(3);
        ListNode Node23 = new ListNode(4);
        ListNode TailNode2 = new ListNode(5);
        HeadNode2.next = Node21;
        Node21.next = Node22;
        Node22.next = Node23;
        Node23.next = TailNode2;
        TailNode2.next = null;
        ArrayList<ListNode> ls1 = new ArrayList<ListNode>() ;
        ls1.add(HeadNode);
        ls1.add(HeadNode2);
        Solutions sol= new Solutions();
       
        ListNode revHead = sol.mergeKLists(ls1);
        while (revHead != null) {
        System.out.print(revHead.val+" ");
        revHead = revHead.next;
        }
    }
	
}	
	
