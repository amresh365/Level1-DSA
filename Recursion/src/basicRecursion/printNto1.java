package basicRecursion;

import java.util.Scanner;

public class printNto1 {
	public static void print(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		print(n-1);
	
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	print(n);
}
}
