package recursion1;

import java.util.Scanner;

public class sumofNnaturalNumber {
	public static int sum(int n) {
		if(n==1)
		{
			return 1;
		}
		return n+sum(n-1);
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=s.nextInt();
	System.out.println(sum(n));
	
}
}