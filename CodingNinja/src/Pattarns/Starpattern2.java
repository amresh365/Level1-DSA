package Pattarns;

import java.util.Scanner;

public class Starpattern2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int i=1,j=1;
	while(i<=n)
	{   j=1;
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
		i++;
		System.out.println();
	}
}
}
