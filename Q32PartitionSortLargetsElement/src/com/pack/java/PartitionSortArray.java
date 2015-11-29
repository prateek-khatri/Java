/*32. Find the kth largest element in an unsorted array. 
 Note that it is the kth largest element in the sorted order,
  not the kth distinct element.
For example,
Given [3,2,1,5,6,4] and k = 2, return 5.
Note: 
You may assume k is always valid, 1 <= k <= array's length.
Answer: The smart approach for this problem is to use the 
selection algorithm (based on the partition method - the same one as used in quicksort).

*/
package com.pack.java;

import java.util.Arrays;

public class PartitionSortArray {


	
public static void main(String[] args) {
	Solutions sol= new Solutions();
	int A[]={3,2,1,5,6,4};

	System.out.println(sol.findKthLargest(A,2));
	
       
    }

}	
	
	


