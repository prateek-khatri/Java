		package com.pack.java;
	
class Solutions{
	   public String multiply(String num1, String num2) {
		   //getting length of the variables
	        int n1 = num1.length(), n2 = num2.length();
	        //solution will be not exceeding n1+n2 variables
	        int[] products = new int[n1 + n2];
	        for (int i = n1 - 1; i >= 0; i--) {
	            for (int j = n2 - 1; j >= 0; j--) {
	                //last characters units place
	            	//conversion to integer
	            	int d1 = num1.charAt(i) - '0';
	                int d2 = num2.charAt(j) - '0';
	                //unit value of 
	                products[i + j + 1] += d1 * d2;
	            }
	        }
	        //stored d mulitilpilication in array [0, 1, 4, 10, 12, 9]//remove carry
	        int carry = 0;
	        for (int i = products.length - 1; i >= 0; i--) {
	            int tmp = (products[i] + carry) % 10;
	            carry = (products[i] + carry) / 10;
	            products[i] = tmp;
	        }
/*	        A mutable sequence of characters. This class provides an API compatible with StringBuffer, but with no guarantee of synchronization. This class is designed for use as a drop-in replacement for StringBuffer in places where the string buffer was being used by a single thread (as is generally the case). Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster under most implementations. 

	        The principal operations on a StringBuilder are the append and insert methods, which are overloaded so as to accept data of any type. Each effectively converts a given datum to a string and then appends or inserts the characters of that string to the string builder. The append method always adds these characters at the end of the builder; the insert method adds the characters at a specified point. 

	        For example, if z refers to a string builder object whose current contents are "start", then the method call z.append("le") would cause the string builder to contain "startle", whereas z.insert(4, "le") would alter the string builder to contain "starlet". 

	        In general, if sb refers to an instance of a StringBuilder, then sb.append(x) has the same effect as sb.insert(sb.length(), x). Every string builder has a capacity. As long as the length of the character sequence contained in the string builder does not exceed the capacity, it is not necessary to allocate a new internal buffer. If the internal buffer overflows, it is automatically made larger. 

	        Instances of StringBuilder are not safe for use by multiple threads. If such synchronization is required then it is recommended that java.lang.StringBuffer be used.
*/
	        StringBuilder sb = new StringBuilder();
	        for (int num : products) sb.append(num);
	        //if anextra 0is there in the beginning delete it
	        while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
	        return sb.length() == 0 ? "0" : sb.toString();
	    }
	}

	