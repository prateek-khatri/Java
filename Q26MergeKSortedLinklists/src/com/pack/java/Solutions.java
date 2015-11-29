package com.pack.java;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Solutions{
	
	public ListNode mergeKLists(List<ListNode> lists) {//boundary condition if null and 0
        if (lists==null||lists.size()==0) return null;
//making a priority queue and a list for it with a comparator
        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(lists.size(),
        		new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1,ListNode o2){
                if (o1.val<o2.val)
                    return -1;
                else if (o1.val==o2.val)
                    return 0;
                else 
                    return 1;
            }
        });

        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;

        for (ListNode node:lists)
            if (node!=null)
                queue.add(node);

        while (!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;

            if (tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
    }
}



