package com.pack.java;
class Solutions{
	int removeDuplicates(int A[], int k) {

		//boundary case for 2 duplicates or if the count is 2
        if (A.length <= k) return A.length;

        //initialize i, and cnt to 1
        int i = 1, j = 1;
        int cnt = 1;
        //j will traverse the entire array
        while (j < A.length) {
          //if same resets the value of cnt=1and i++
        	if (A[j] != A[j-1]) {
                //cnt is used to keep track of k
            	cnt = 1;
                
            	A[i++] = A[j];
            }
        	//increments the value of cnt and i
            else {
                if (cnt < k) {
                    A[i++] = A[j];
                    cnt++;
                }
            }
            ++j;
        }
        return i;
}



}	