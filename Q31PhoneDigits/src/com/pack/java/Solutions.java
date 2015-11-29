package com.pack.java;

import java.util.LinkedList;
import java.util.List;

class Solutions{
	public List<String> letterCombinations(String digits) {
	    LinkedList<String> ans = new LinkedList<String>();
	    String[] mapping = new String[] {"0", "1", "abc", "def", 
	    		"ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	    ans.add("");
	    
	    for(int i =0; i<digits.length();i++){
	    //numeric value ie 2 is x
	    	int x = Character.getNumericValue(digits.charAt(i));
	        // a is 1=1 for the x=3
	    	while(ans.peek().length()==i){
	//removing only one letter ega then combine with the other letters in the loop do it untill peek equal i        
	    		String t = ans.remove();
	            //do mapping of s in an array
	    		for(char s : mapping[x].toCharArray())
	            
	    			ans.add(t+s);
	        }
	    }
	    return ans;
	}

	}

	