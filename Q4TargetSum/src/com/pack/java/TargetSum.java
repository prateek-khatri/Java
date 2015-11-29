/*4. Given an array of integers, find two numbers such that 
 * they add up to a specific target number.
The function twoSum should return indices of the two numbers 
such that they add up to the target, where index1 must be less than index2. 
Please note that your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution.
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
*/
package com.pack.java;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {
	public static int[] twoSum(int[] numbers, int target) {
	    int[] result = new int[2];
	    //y hash map as it stores the adjacent values as a table in 2 is the index and the value is its location index 1
	    //and its index no the value of the no is stored eg 2 is stored and then the no  
	    
	    
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i + 1;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i + 1);
	    }
	    return result;
	}


	
public static void main(String[] args) {
	int y[]={2, 7, 11, 15};
	int x[]=twoSum(y ,26);
	for (int i = 0; i < x.length; i++) {
		System.out.println(x[i]);
	}
	
//System.out.println(TargetSum());
}



}
