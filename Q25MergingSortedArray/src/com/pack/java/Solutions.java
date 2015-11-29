		package com.pack.java;
	
class Solutions{

	
	    int [] merge(int A[],  int B[]) {
	        int i=A.length-1;
	        int j=B.length-1;
	        int k = A.length+B.length;
	        int C[] = new int[k];
	        k--;
	        while(i >=0 && j>=0)
	        {
	           //A[i] is greaterdecrement i and k and assign value in main array
	        	if(A[i] > B[j])
	                C[k--] = A[i--];
	            
	        	else
	                C[k--] = B[j--];
	        }
	        while(j>=0)
	            C[k--] = B[j--];
	        while(i>=0)
	            C[k--] = A[i--];
			return C;
	    }

	}

	

	