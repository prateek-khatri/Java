package com.pack.java;
class Solutions{
	public int[] productExceptSelf(int[] nums) {
	   /// of array lenght
		int n = nums.length;
	    //results of samelenth as nums
		
		int[] res = new int[n];
	    res[0] = 1;
// As res of [0] is defined start from res[1] go to the left
	    for (int i = 1; i < n; i++) {
	        res[i] = res[i - 1] * nums[i - 1];
	    }
	    //rightis 1
	    int right = 1;
//	  traverse from right
	    for (int i = n - 1; i >= 0; i--) {
	        res[i] *= right;
	        right *= nums[i];
	    }
	    return res;

	}



}	