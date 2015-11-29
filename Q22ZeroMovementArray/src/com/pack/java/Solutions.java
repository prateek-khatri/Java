		package com.pack.java;
	
class Solutions{
	public int[] moveZeroes(int[] nums) {
	    //boundary length is 0 or null
		if (nums == null || nums.length == 0) return nums;        
		
	    int insertPos = 0;
	   //after result is [1, 3, 12, 3, 12] zero is over written bythe remaiing array n insert position is3
	    for (int num: nums) {
	    
	    	if (num != 0) nums[insertPos++] = num;
	    }    
	    //go to the position 3 n then add 0
	    while (insertPos < nums.length) {
	    
	    	nums[insertPos++] = 0;
	    }
	return nums;
	}

	}

	