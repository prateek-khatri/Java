/*8. Suppose a sorted array is rotated at some pivot unknown to you beforehand.
(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
You are given a target value to search. 
If found in the array return its index, otherwise return -1.
You may assume no duplicate exists in the array.
*/
package com.pack.java;



public class PivotRotationSearch {


	
public static void main(String[] args) {
	int y[]={1, 2,4, 5, 6, 7,0};
	Solutions sol= new Solutions();
//	sol.search(y,y.length,7);
	/*int i=0;
	for (Integer integer : y) {
		System.out.print(integer);
		if(i!=y.length-1){
			System.out.print(" , ");
		i++;
		}*/
	  System.out.println(sol.search(y,0));	


}

}
