package com.pack.java;

import java.util.Arrays;

//get the middle no such that the numbers higher than it are not greater

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */
//binary search
public class Solutions extends VersionControl {
	public int firstBadVersion(int n) {
	    int start = 1, end = n;
	    while (start < end) {
	        int mid = start + (end-start) / 2;
	        if (!isBadVersion(mid)) start = mid + 1;
	        else end = mid;            
	    }        
	    return start;
	}

}
