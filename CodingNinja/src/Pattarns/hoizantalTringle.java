package Pattarns;

import java.util.Scanner;

public class hoizantalTringle {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=s.nextInt();
	int row=n-1;
	int col=n/2;
	int temp=0;
	for(int i=1;i<=row;i++)
	{   
		if(i<=n/2)
		{
			temp=i;
		}else {
			temp--;
		}
		for(int j=1;j<=temp;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
