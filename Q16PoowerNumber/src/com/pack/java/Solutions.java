		package com.pack.java;
	//Recursive algo	 x^n = x^(n/2) * x^(n/2) * x^(n%2)
class Solutions{
	public double pow(double x, int m) {
     
		
		//if raised to zero=1 boundary condition
		double temp=x;
        if(m==0)
        return 1;
        
        temp=pow(x,m/2);
        //means even 
        if(m%2==0)
        return temp*temp;
        else 
        {
       //for odd power & positive
        	if(m > 0)
            return x*temp*temp;
        else
            //negative even/odd power nos
        	return (temp*temp)/x;
        }


	}



}	