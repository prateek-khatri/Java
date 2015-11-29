/*You are given a m x n 2D grid initialized with these three possible values.
-1 - A wall or an obstacle.
0 - A gate.
2147483647 - 2147483647inity means an empty room. We use the value 231 - 1 = 2147483647 to represent 2147483647 as you may assume that the distance to a gate is less than2147483647.
Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with 2147483647.
For example, given the 2D grid:
INF  -1  0  INF
INF INF INF  -1
INF  -1 INF  -1
  0  -1 INF INF
After running your function, the 2D grid should be:
  3  -1   0   1
  2   2   1  -1
  1  -1   2  -1
  0  -1   3   4
  Done in DFS need to do in BFS
  */

package com.pack.java;

public class ExcutionJava {
	//DFS
	 public static void wallsAndGates(int[][] rooms) {
	     //extreme case for null values and 0    
		 if (rooms == null || rooms.length == 0) {
	            return;
	        }
	         //taking the matrix length and breadth
	        int m = rooms.length;
	        int n = rooms[0].length;
	         //Initializing visiting with the matrix length
	        boolean[][] visited = new boolean[m][n];
	         //traversing the entire matrix
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                if (rooms[i][j] == 0) {
	                    wallsAndGatesHelper(i, j, 0, visited, rooms);
	                }
	            }
	        }
	    }
	     
	    private static void wallsAndGatesHelper(int row, int col, int distance, boolean[][] visited, int[][] rooms) {
	        
	    	int rows = rooms.length;
	        int cols = rooms[0].length;
	        
	        //worst case row value is less than 0 or greater than length 
	        //boundary conditions no action
	        if (row < 0 || row >= rows || col < 0 || col >= cols) {
	            return;
	        }
	         
	        // visited
	        if (visited[row][col]) {
	             return;
	        }
	         
	        // Is wall?
	        if (rooms[row][col] == -1) {
	            return;
	        }
	         
	        // Distance greater than current
	        if (distance > rooms[row][col]) {
	            return;
	        }
	         
	         
	        // Mark as visited
	        visited[row][col] = true;
	         
	        if (distance < rooms[row][col]) {
	            rooms[row][col] = distance;
	        }
	         
	        // go dfs direction up, down, left and right
	        wallsAndGatesHelper(row - 1, col, distance + 1, visited, rooms);
	        wallsAndGatesHelper(row + 1, col, distance + 1, visited, rooms);
	        wallsAndGatesHelper(row, col - 1, distance + 1, visited, rooms);
	        wallsAndGatesHelper(row, col + 1, distance + 1, visited, rooms);
	         
	        // Mark as unvisited
	        visited[row][col] = false;
	    }
public static void main(String[] args) {
	int [][]rooms={
			{2147483647,  -1 , 0,  2147483647},
			{2147483647, 2147483647, 2147483647,  -1},
			{2147483647,  -1, 2147483647,  -1},
			{ 0,  -1, 2147483647, 2147483647}
	};

	
	wallsAndGates(rooms);
	for(int i=0; i<rooms.length;i++){
		for(int j=0; j<rooms.length;j++){
			System.out.print(rooms[i][j]+"\t");	
		}System.out.println();
	}
	
}
}
