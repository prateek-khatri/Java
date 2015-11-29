package com.pack.java;

import java.util.Arrays;

//get the middle no such that the numbers higher than it are not greater

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */
//binary search
public class Solutions  {
    public String convertToTitle(int n) {
     
 /*   	StringBuilder objects are like String objects, 
  * except that they can be modified. Internally, these objects are treated
  *  like variable-length arrays that contain a sequence of characters.
  *  
  *   At any point, the length and content of the sequence
  *    can be changed through method invocations.
  *    https://docs.oracle.com/javase/tutorial/java/data/buffers.html
 */   	
    	StringBuilder result = new StringBuilder();

        while(n>0){
            n--;
            
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }

        return result.toString();
    }


}
