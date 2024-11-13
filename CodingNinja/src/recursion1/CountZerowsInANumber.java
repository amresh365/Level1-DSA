package recursion1;

import java.util.Scanner;

public class CountZerowsInANumber {
	public static int count(int n)
	{        if(n<=0)
         	{
		        return 1;
        	}
		
		    // Count the zeros in the last digit  
		    int currentCount = 0;
		    if(n%10==0)
		    {
		    	currentCount=1;
		    }else {
		    	currentCount=0;
		    }
		    
		    // Include the count from the rest of the digits  
		    return currentCount + count(n / 10);  
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	int countDigit=0;
//	while(n>=0)
//	{
//		
//	}
	System.out.println(count(n));
}
}
