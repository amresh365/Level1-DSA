package Pattarns;

import java.util.Scanner;

public class ZeroOnePattern {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter Number");
	int n=sc.nextInt();
	int i=1,j=1;
	boolean b;
	while(i<=n)
	{ 
	 if(i%2==0)
	{
		b=false;
	}else {
		b=true;
	}
		j=1;
		while(j<=i)
		{    if(b==true)
		{
			 System.out.print(1);
			 b=false;
		}else {
			System.out.print(0);
			b=true;
		}
			
			 j++;
		}
		System.out.println();
		
		i++;
		
	}
}
}
