/*39. You are a product manager and currently leading a team 
 * to develop a new product. Unfortunately, the latest version of 
 * your product fails the quality check. Since each version is developed 
 * based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find
 out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which will return
 whether version is bad. Implement a function to find the first bad version.
  You should minimize the number of calls to the API.

*/
package com.pack.java;



public class BadVersion {


	
public static void main(String[] args) {
	Solutions sol= new Solutions();
	int A[]={0,1,3,5,6};
	/*int [][]edges = {{0, 1}, {1, 2}, {3, 4}};
	int [][]edges1 = {{0, 1}, {0, 2}, {0, 3},{1,4}};*/
	System.out.println(sol.firstBadVersion(5));
	//System.out.println(sol.validTree(5, edges1));
       
    }

}	
	
	


