		package com.pack.java;
	
class Solutions{

	
	public int findKthLargest(int[] nums, int k) {

        k = nums.length - k;
        int lo = 0;
        int hi = nums.length - 1;
      
        while (lo < hi) {
        
        	final int j = partition(nums, lo, hi);
            
        	if(j < k) {
                lo = j + 1;
            }
        	
        	else if (j > k) {
                hi = j - 1;
            } 
        	
        	else {
                break;
            }
        }
        return nums[k];
    }

    private int partition(int[] a, int lo, int hi) {
//j=length and i= 0
        int i = lo;
        int j = hi + 1;
        
        while(true) {
        //get the center partition if the value is between a [i] & a[j]
        	while(i < hi && less(a[++i], a[lo]));
            
        	while(j > lo && less(a[lo], a[--j]));
            
        	if(i >= j) {
                break;
            }
            
        	exch(a, i, j);
        }
        
        exch(a, lo, j);
        
        return j;
    }
//swap
    private void exch(int[] a, int i, int j) {
     
    	final int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
   
    }

    private boolean less(int v, int w) {
       
    	return v < w;
    }

	}

	

	