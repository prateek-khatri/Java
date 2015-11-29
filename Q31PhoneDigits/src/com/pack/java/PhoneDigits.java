/*31. Given a digit string, return all possible letter combinations
  that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given below.
Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Note:
Although the above answer is in lexicographical order,
 your answer could be in any order you want.
*/
package com.pack.java;
import java.util.List;

public class PhoneDigits {

public static void main(String[] args) {
	Solutions sol= new Solutions();
	

	List<String> lc=sol.letterCombinations("23");

System.out.println(lc.toString());
    }

}	
	
	


