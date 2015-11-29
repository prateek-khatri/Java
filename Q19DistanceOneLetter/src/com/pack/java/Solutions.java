		package com.pack.java;
	
class Solutions{

		public boolean isOneEditDistance(String s, String t) {
	//boundary canthave more than 1 letter difference
			if (Math.abs(s.length() - t.length()) > 1) {
		        return false;
		    }

		    int diff = s.length() - t.length();
		    String longer = diff > 0 ? s : t;  // potentially longer string
		    String shorter = diff > 0 ? t : s; // potentially shorter string
		    for (int i = 0; i < shorter.length(); i++) {
		        if (longer.charAt(i) != shorter.charAt(i)) {
		            // we allow only one mismatch, afterwards the substrings should match
		            if (diff == 0) {
		                // strings are equal in length, they are only 1 edit distance
		                // apart if substrings cut after index i are equal
		                // ....a[xyz]
		                // ....b[xyz]
		                String longerSubstr = longer.substring(i + 1, longer.length());
		                String shorterSubstr = shorter.substring(i + 1, shorter.length());
		                return longerSubstr.equals(shorterSubstr);
		            } else {
		                // longer string is actually longer, substring cut after i should
		                // match substring cut at i on the shorter string
		                // ....a[xyz]
		                // ....[xyz]
		                String longerSubstr = longer.substring(i + 1, longer.length());
		                String shorterSubstr = shorter.substring(i, shorter.length());
		                return longerSubstr.equals(shorterSubstr);
		            }
		         }
		    }

		    // at this point we know the potentially longer string matches all of the
		    // potentially shorter string. Only case when this is still one edit distance
		    // apart is if the potentially longer string is actually longer.
		    return diff != 0;
		}


	}
