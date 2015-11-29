package com.pack.java;
class Solutions{
	public boolean isMatch(String s, String p) {
	    //boundary if p is empty return true if s is empty
		if (p.isEmpty()) {
	        return s.isEmpty();
	    }

		//end condition for the recursive loop
	    if (p.length() == 1 || p.charAt(1) != '*') {
	    	 
	        if (s.isEmpty() || (p.charAt(0) != '.' && p.charAt(0) != s.charAt(0))) {
	            return false;
	        } else {
	            return isMatch(s.substring(1), p.substring(1));
	        }
	    }

	    
	    //P.length() >=2
	    while (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {  
	        if (isMatch(s, p.substring(2))) { 
	            return true;                     
	        }                                    
	        s = s.substring(1);
	    }

	    return isMatch(s, p.substring(2));
	}



}	