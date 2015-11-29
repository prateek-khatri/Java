package com.pack.java;
	
//get the middle no such that the numbers higher than it are not greater

public class Solutions { 
	
	 //O(LogN), binary search
    public int hIndex(int[] citations) {
       
    	int l=0, r=citations.length-1, n=citations.length;
        
    	while(l<=r){
        
    		int mid = l + (r-l)/2;
            
    		if(n-mid<=citations[mid]) 
    			r = mid-1;
            
            else    
            	l = mid+1;
        }
        return n - l;
    }
}