package com.pack.java;
	
//get the middle no such that the numbers higher than it are not greater



/*The idea is to see that the result can only 
  range from 0 to the length of the array
  (because we can't have h-index greater than the total papers published).
   So we create an array "arr" which acts like a HashMap 
   (using pigeon hole principle) and loop backwards from the highest element,
    then we find "tot" which is the total number of papers that
     has more than i citations, and we stop when tot>=i 
     (total number of papers with more than i citations >= i).
      We don't need to keep going because we are trying the biggest i possible, 
      we we stop and return the result
*/
public class Solutions { 
	
	public int hIndex(int[] citations) {
    int n = citations.length, tot=0;
    //1 more than the citations
    int[] arr = new int[n+1];
    
    for (int i=0; i<n; i++) {
        
    	if (citations[i]>=n) 
        //increment last value	
        	arr[n]++;
        else 
        //increment the placed citation value
        	arr[citations[i]]++;
    }//add like counting sort
    for (int i=n; i>=0; i--) {
        
    	tot += arr[i];//total >=i// help you reach the middle
        if (tot>=i) 
        	
        	return i;
    }
    return 0;
}
}