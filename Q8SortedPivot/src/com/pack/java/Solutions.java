package com.pack.java;
class Solutions{
	//binary search needs a sorted array
	//if we find the lowest value in the array we will come to know 
	//where the rotation has taken place
	 int search(int A[], int target) {

		 int lo=0,hi=A.length-1;
	        // find the index of the smallest value using binary search.
	        // Loop will terminate since mid < hi, and lo or hi will shrink by at least 1.
	        // Proof by contradiction that mid < hi: 
	        //if mid==hi, 
	        //then lo==hi and loop would have been terminated.
	        while(lo<hi){
	            int mid=(lo+hi)/2;
	            if(A[mid]>A[hi]) lo=mid+1;
	            else hi=mid;
	        }
	        // lo==hi is the index of the smallest value and also the number of places rotated.
	        int rot=lo;
	        lo=0;hi=A.length-1;
	        // The usual binary search and accounting for rotation.
	        while(lo<=hi){
	            int mid=(lo+hi)/2;
	            int realmid=(mid+rot)%(A.length-1);
	            if(A[realmid]==target)return realmid;
	            if(A[realmid]<target)lo=mid+1;
	            else hi=mid-1;
	        }
	        return -1;
	    }

}