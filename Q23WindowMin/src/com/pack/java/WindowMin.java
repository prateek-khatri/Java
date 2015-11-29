/*23. Given a string S and a string T, find the minimum window in S 
 * which will contain all the characters in T in complexity O(n).
For example,
S = "ADOBECODEBANC"
T = "ABC"
Minimum window is "BANC".
Note:
If there is no such window in S that covers all characters in T, return the empty string "".
If there are multiple such windows, you are guaranteed that 
there will always be only one unique minimum window in S.
*/
package com.pack.java;

import java.util.Arrays;

public class WindowMin {


	
public static void main(String[] args) {
	Solutions sol= new Solutions();
	int A[]={0, 1, 0, 3, 12};

	System.out.println(sol.minWindow("ADOBECODEBANC","ABC"));
	
       
    }

}	
	
	


