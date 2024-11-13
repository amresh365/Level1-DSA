package Pattarns;

import java.util.Scanner;

public class InvertedNumberPrint {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Ente The Number");
	int n=sc.nextInt();
	int i=1;int j=1;
	while(i<=n)
	{
		j=1;
		while(j<=n-i+1)
		{
			System.out.print(i);
			j++;
		}
		System.out.println();
		i++;
	}
	
}
}
