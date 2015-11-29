package com.pack.java;
class Solutions{
	//removes duplicates and returns the length
	public int removeDuplicates(int[] nums) {
        //boundary condition when the length is less than 2 ie 1 or 0
		
		if(nums.length < 2) return nums.length;
        int id = 1;
        
        for(int i = 1; i < nums.length; ++i) 
            if(nums[i] != nums[i-1]) nums[id++] = nums[i];
        return id;

    }


}	