package com.pack.java;
	
public class Solutions { public int strStr(String haystack, String needle) {
//boundary condition if needle value is 0
    if(needle.length() == 0) {
        return 0;
    }

    //needles length is more than return -1
    if(needle.length() > haystack.length()) {
        return -1;
    }

    //creating a movable window. which moves along the right of haystack
    for(int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
        if(haystack.substring(i,j).equals(needle)) {
            return i;
        }
    }
    return -1;
}
}