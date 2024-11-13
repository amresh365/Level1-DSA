package Pattarns;

import java.util.Scanner;

public class codeMirrorImageWithSpace {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter THe Number");
	int n =sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		int count=1;
		for(int j=n-i;j<n;j++)
		{
			System.out.print(count);
			count++;
		}
		System.out.println(); 
	}
	
	
}
}
