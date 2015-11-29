/*22. Given an array nums, write a function to move all 0's to the end 
 * of it while maintaining the relative order of the non-zero elements.
For example, given nums = [0, 1, 0, 3, 12], 
after calling your function, nums should be [1, 3, 12, 0, 0].
*/
package com.pack.java;

import java.util.Arrays;

public class ZeroMovementArray {


	
public static void main(String[] args) {
	Solutions sol= new Solutions();
	int A[]={0, 1, 0, 3, 12};

	System.out.println(Arrays.toString(sol.moveZeroes(A)));
	
       
    }

}	
	
	


