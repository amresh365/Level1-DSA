package Pack.math.dsa.amresh;

import java.util.Scanner;

public class CheakPrime {
	public static void brut(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			  if(n%i==0)
			  {
		 		  count++;
			  }
			  
		}
		if(count==2)
		{
			System.out.println("This is a prime number");
			
		}else {
			System.out.println("This not a prime number");
		}
	}
	public static void optimal(int n)
	{
		int count=0;
		for(int i=1;i*i<=n;i++)
		{
			  if(i%2==0)
			  {
				  count++;
			  }
			  if((n/i)!=i)
			  {
				  count++;
			  }
			  
		}
		if(count==2)
		{
			System.out.println("This is a prime number");
			
		}else {
			System.out.println("This not a prime number");
		}
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=s.nextInt();
	optimal(n);
//	brut(n);
}
}
