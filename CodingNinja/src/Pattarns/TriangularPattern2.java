package Pattarns;

import java.util.Scanner;

public class TriangularPattern2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	int i=1,j=1;
	int count=1;
	while(i<=n)
	{
		while(j<=i)
		{
			System.out.print(count);
			count++;
			j++;
		}
		j=1;
		System.out.println("\n");
		i++;
	}
}
}
