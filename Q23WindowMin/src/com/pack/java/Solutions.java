		package com.pack.java;
	
class Solutions{

	boolean isCovered(int hsource[], int htarget[]) {
	
		for (int i = 0; i < htarget.length; i++) {
	    
			if (htarget[i] > hsource[i] ) 
	        
				return false;           
	    }
	    
		return true;
	}

	public String minWindow(String s, String t) {       
	    //http://www.asciitable.com/ ascii is 256
		int hsource[] = new int[256];
	    int htarget[] = new int[256]; 
	   
	    //Hash map to count characters in s, t        
	    for (char c : t.toCharArray())
	        htarget[c]++;

	    int j = 0, min = Integer.MAX_VALUE;
	    String minStr = "";
	    
	    
	    for (int i = 0; i < s.length();i++) {
	    
	    	while (!isCovered(hsource, htarget) && j < s.length()) {
	        	
	        	//Spread right side of sliding window
	            hsource[s.charAt(j)]++;
	            j++;
	        }

	        if (isCovered(hsource, htarget)) {
	        
	        	if (j - i + 1 < min) {
	            
	        		minStr = s.substring(i, j);
	            
	        		min = j - i + 1;
	            
	        	}               
	        }           
	       
	        hsource[s.charAt(i)]--;
	        
	        //Left side of the window will shrink to i+1     
	    }

	    return minStr;
	}
	}

	