package Pattarns;

import java.util.Scanner;

public class squarePatter3 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter Number");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>=1;j--)
		{
		System.out.print(j);	
		}
		System.out.print("\n");	
	}
}
}
