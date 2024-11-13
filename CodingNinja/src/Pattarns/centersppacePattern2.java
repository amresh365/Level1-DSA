package Pattarns;

import java.util.Scanner;

public class centersppacePattern2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i=n-1;
	while(i>=0)
	{
		int j=1;
		while(j<=n-i)
		{
			System.out.print(j);
			j++;
		}
		
		int k=0;
		while(k<2*i)
		{
			System.out.print(" ");
			k++;
		}
		
		j=n-i;	
		while(j>=1)
		{
			System.out.print(j);
			j--;
		}
		System.out.println();
		i--;
	}
	
}
}
