package Pattarns;

import java.util.Scanner;

public class characterPatter3 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter Number");
	int n=sc.nextInt();
	int i=1,j=1;
	while(i<=n)
	{
		j=1;
		while(j<=i)
		{
			 System.out.print((char)('A'+i+-1));
			 j++;
		}
		System.out.println();
		
		i++;
		
	}
}
}
