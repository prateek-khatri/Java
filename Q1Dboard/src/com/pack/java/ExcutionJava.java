/*1.	Given a 2D board and a word, find if the word exists in the grid.
The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
For example,
Given board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.
*/

package com.pack.java;

public class ExcutionJava {
	public static boolean exists1(char[][] board, String word) {
	    //word enters and the board string enters
		
		char[] w = word.toCharArray();
		//traverse through the i & j ie x and y axis
	    for (int y=0; y<board.length; y++) {
	        for (int x=0; x<board[y].length; x++) {
	        	
	            if (exist(board, y, x, w, 0)) return true;
	        }
	    }
	    return false;
	}
	private static boolean exist(char[][] board, int y, int x, char[] word, int i) {
	    //corner case where the word length
		if (i == word.length) return true;
		//reach maxlength
	    if (y<0 || x<0 || y == board.length || x == board[y].length) return false;
	    //no match
	    if (board[y][x] != word[i]) return false;
	   //convert the char which is found as garbage
	    board[y][x] ^= 256;
	    // going all the sides for the next word
	    boolean exist = exist(board, y, x+1, word, i+1)
	        || exist(board, y, x-1, word, i+1)
	        || exist(board, y+1, x, word, i+1)
	        || exist(board, y-1, x, word, i+1);
	   //runs uptill exit condition of i=word.legth
	    board[y][x] ^= 256;
	    return exist;
	}
public static void main(String[] args) {
	char[][] board =
		{
		{'A','B','C','E'},
		{'S','F','C','S'},
		{'A','D','E','E'}
		};
	
	System.out.println(exists1(board,"ABC"));
	System.out.println(exists1(board,"SEE"));
	System.out.println(exists1(board,"ABCB"));
}



}
