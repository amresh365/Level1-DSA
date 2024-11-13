package Pattarns;

import java.util.Scanner;

public class DiamandStarPattern {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int i=1,j=1;
	int n1=(n+1)/2;
	int n2=n1-1;
	
	while(i<=n1)
	{
		    j=1;
			while(j<=n1-i)
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
		 
		 i++;
		 System.out.println();
	}
	i=n2;
	while(i>=1)
	{
		j=1;
		while(j<=n2-i+1) {
			System.out.print(" ");
			j++;
		}
		int k=1;
		while(k<=2*i-1) {
			System.out.print("*");
			k++;
		}
	
		System.out.println();
		i--;
	}
	
}
}
