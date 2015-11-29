package com.pack.java;


//Using Counting sort

class Solutions{
	
	public void sortColors(int[] nums) {
	//boundary conditions for null and length less than 2
		if(nums==null||nums.length<2){
	        return;
	    }
	 
		//if the value is 0 then it will increment it the middle guy of counting sort
	    int[] countArray = new int[3];
	    for(int i=0; i<nums.length; i++){
	        countArray[nums[i]]++;
	    }
	 
	    //after 0 adding the value of the c[1]=c[0] +c[2]
	    for(int i=1; i<=2; i++){
	        countArray[i]=countArray[i-1]+countArray[i];
	    }
	 
	    //sorted is the array where the values would be placed
	    int[] sorted = new int[nums.length];
	    for(int i=0;i<nums.length; i++){
	    	
	        //int index = countArray[nums[i]]-1;
	        //countArray[nums[i]] = countArray[nums[i]]-1;
	        
	    	
	    	sorted[--countArray[nums[i]]]=nums[i];
	    }
	    
	 
	    System.arraycopy(sorted, 0, nums, 0, nums.length);
	  
	  //  nums=sorted;
	}

}