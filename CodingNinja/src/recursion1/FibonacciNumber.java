package recursion1;

import java.util.Scanner;

public class FibonacciNumber {
	public static int fibo(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		return fibo(n-1)+(n-2);
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=s.nextInt();
	System.out.println(fibo(n));
	
}
}
