/*9. Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
You may not alter the values in the nodes, only nodes itself may be changed.
Only constant memory is allowed.
For example,
Given this linked list: 1->2->3->4->5
For k = 2, you should return: 2->1->4->3->5
For k = 3, you should return: 3->2->1->4->5

*/
package com.pack.java;



public class ReverseLinkList {


	
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
        Solutions sol= new Solutions();
       
        ListNode revHead = sol.reverseKGroup(HeadNode, 3);
        while (revHead != null) {
        System.out.print(revHead.val+" ");
        revHead = revHead.next;
        }
    }
	
}	
	
	
	/*
	
	
	ListNode ln1= new ListNode(1);
	ListNode ln2 = new ListNode(2);
	ListNode ln3 = new ListNode(3);
	ListNode ln4 = new ListNode(4);
	ListNode ln5 = new ListNode(5);
	ln1.next=ln2;
	ln2.next=ln3;
	ln3.next=ln4;
	ln4.next=ln5;
	ln5.next=null;
Solutions sol= new Solutions();
ln1=sol.reverseKGroup(ln1, 3);
System.out.println(ln1.val+ " "+ ln1.next.val+ 
		" "+ln1.next.next.val+ " "+ln1.next.next.next.val
		+" "+ln1.next.next.next.next.val
		);*/



