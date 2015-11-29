/*12. Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?
For example,
Given sorted array nums = [1,1,1,2,2,3],
Your function should return length = 5, 
with the first five elements of nums being 1, 1, 2, 2 and 3. 
It doesn't matter what you leave beyond the new length.

*/
package com.pack.java;



public class CountDuplicateRemove {


	
public static void main(String[] args) {
	Solutions sol= new Solutions();
	int A[]={1,1,1,2,2,3};

	System.out.println(sol.removeDuplicates(A,2));
	
       
    }
	
}	
	
	


