/*38. Given n nodes labeled from 0 to n - 1 and 
 a list of undirected edges (each edge is a pair of nodes), 
 write a function to check whether these edges make up a valid tree.

For example:

Given n = 5 and edges = [[0, 1], [0, 2], [0, 3], [1, 4]], return true.

Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [1, 3], [1, 4]], return false.

Hint:

Given n = 5 and edges = [[0, 1], [1, 2], [3, 4]], what should your return? 
Is this case a valid tree? Show More Hint 
Note: you can assume that no duplicate edges will appear in edges.
 Since all edges are undirected, [0, 1] is the same as [1, 0] and 
 thus will not appear together in edges.
*/
package com.pack.java;



public class ValidTree {


	
public static void main(String[] args) {
	Solutions sol= new Solutions();
	int A[]={0,1,3,5,6};
	int [][]edges = {{0, 1}, {1, 2}, {3, 4}};
	int [][]edges1 = {{0, 1}, {0, 2}, {0, 3},{1,4}};
	System.out.println(sol.validTree(5, edges));
	System.out.println(sol.validTree(5, edges1));
       
    }

}	
	
	

