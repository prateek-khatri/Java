/*15. Given an array of n integers where n > 1,
nums, return an array output such that output[i] 
is equal to the product of all the elements of nums except nums[i].
Solve it without division and in O(n).
For example, given [1,2,3,4], return [24,12,8,6].


*/
package com.pack.java;

import java.util.Arrays;

public class ProductElementsArray {


	
public static void main(String[] args) {
	Solutions sol= new Solutions();
	int A[]={1,2,3,4};

	System.out.println(Arrays.toString(sol.productExceptSelf(A)));
	
       
    }

}	
	
	


