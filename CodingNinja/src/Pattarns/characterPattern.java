package Pattarns;

import java.util.Scanner;

public class characterPattern {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter Number");
	int n=sc.nextInt();
	int i=1,j=1;
	
	while(i<=n)
	{
		j=1;
		while(j<=n)
		{
			 System.out.print((char)('A'+j-1));
			 j++;
		}
		System.out.println();
		i++;
		
	}
	
}
}
