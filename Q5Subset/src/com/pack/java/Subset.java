/*5.Note: 1) Elements in a subset must be in non-descending order. 
 * 2) The solution set must not contain duplicate subsets.

For example, given S = [1,2,3], the method returns:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

*/
package com.pack.java;


import java.util.ArrayList;


public class Subset {


	
public static void main(String[] args) {
	int y[]={1,2,3};
	Solutions sol= new Solutions();
	ArrayList<ArrayList<Integer>> x=sol.subsets(y);
	for (ArrayList<Integer> arrayList : x) {
		int i=0;
		for (Integer integer : arrayList) {
			System.out.print(integer);
			if(i!=arrayList.size()-1){
				System.out.print(" , ");
			i++;
			}
		}
		System.out.println();
	}
	
//System.out.println(TargetSum());
}



}
