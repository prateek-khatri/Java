		package com.pack.java;
	
class Solutions{

	public int minSubArrayLen(int s, int[] a) {
		//boundary  
		if (a == null || a.length == 0)
		    return 0;

		
		  int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

		  //get the sum of allthe elements of thearray
		  while (j < a.length) {
		    sum += a[j++];
//usingDP
		    //use i to remove all the elements of the array until we get a no >= sum
		    //min is the previous min whichHas been memonized and we then find the apt value
		    while (sum >= s) {
		      min = Math.min(min, j - i);
		      sum -= a[i++];
		    }
		  }
		  return min == Integer.MAX_VALUE ? 0 : min;
		}
	}

	