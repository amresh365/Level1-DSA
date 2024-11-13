package Pattarns;

import java.util.Scanner;

public class characterTranglepattern3 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter Number");
	int n=5;
	int i=1,j=1;
	while(i<=n)
	{   int count=1;
		j=1;
		while(j<=i)
		{
			System.out.print((char)('E'-count+1));
			count++;
			j++;
		}
		System.out.println();
		i++;
	}
}
}
