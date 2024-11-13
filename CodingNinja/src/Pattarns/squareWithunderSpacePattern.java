package Pattarns;

import java.util.Scanner;

public class squareWithunderSpacePattern {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i=0;
	int j=1;
	int n1=n/2;
	int n2=n/2;
	while(i<n1)
	{
		j=n1-i;
		while(j>=1)
		{
	     System.out.print("*");
	     j--;
		}
		int k=1;
		while(k<=2*i)
		{
			System.out.print(" ");
			k++;
		}
		j=n1-i;
		while(j>=1)
		{
	     System.out.print("*");
	     j--;
		}
		i++;
		System.out.println();
	}
	
	//Down Second Part
	 i=n2-1;
     while(i>=0)
    {

	    j=n2-i;
	   while(j>=1)
	   {
		   System.out.print("*");
		   j--;
	   }
	   int k=1;
	   while(k<=2*i)
	   {
		   System.out.print(" ");
		   k++;
	   }
	   
	   j=n2-i;
	   while(j>=1)
	   {
		   System.out.print("*");
		   j--;
	   }
	   System.out.println();
	   i--;
    }
}
}
