package Pattarns;

import java.util.Scanner;

public class InvertedTringleStarPattern2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	int i=n,j=1;
	while(i>=1)
	{
		j=1;
		while(j<=n-i)
		{
			System.out.print(" ");
			j++;
		}
		int k=1;
		while(k<=2*i-1)
		{
			System.out.print("*");
			k++;
		}
		System.out.println();
		i--;
	}
	
	
}
}
