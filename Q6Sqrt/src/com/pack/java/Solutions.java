package com.pack.java;


//Newtons Method

class Solutions{
    public int sqrt(int x) {
       //	just like binary search
    	long i = 0;
        //get middle of the digit
    	long j = x / 2 + 1;
        
        while (i <= j) {
        	//get the middle no between i and j
            long mid = (i + j) / 2;
            if (mid * mid == x)
                return (int)mid;
            if (mid * mid < x)
                i = mid + 1;
            else
                j = mid - 1;
        }
        return (int)j;
    }

}