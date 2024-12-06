package Pack.math.dsa.amresh;

import java.util.Scanner;

public class GCD_HCF {
	public static void gcd2(int n1,int n2)
	{
		int ans=0;
		for(int i=1;i<Math.min(n1, n2);i++)
		{
			if(n1%i==0&&n2%i==0)
			{
				ans=i;
				
			}
			
		}
		System.out.println(ans);
		
	}
	public static void gcd1(int n1,int n2)
	{
		for(int i=Math.min(n1, n2);i>=1;i--)
		{
			if(n1%i==0&&n2%i==0)
			{
				System.out.println(i);
				break;
			}
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int n1=sc.nextInt();
	System.out.println("Enter the number");
	int n2=sc.nextInt();
	
//	gcd1(n1,n2);
	gcd2(n1,n2);
	
	
}
}
