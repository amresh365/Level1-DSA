package recursion1;

import java.util.Scanner;

public class printNnumber {
	public static void printN(int n) {
		if(n==0) {
			return;
		}
		printN(n-1);
		System.out.println(n);
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=s.nextInt();
	printN(n);
	
}
}
