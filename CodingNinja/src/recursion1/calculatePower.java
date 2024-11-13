package recursion1;

import java.util.Scanner;

public class calculatePower {
	public static int calPow(int x,int n) {
		if(n==1)
		{
			return 1;
		}
		return x*calPow(x,n-1);
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number x");
	int x=s.nextInt();
	System.out.println("Enter the Number");
	int n=s.nextInt();
	System.out.println(calPow(x,n));
	
	
}
}
