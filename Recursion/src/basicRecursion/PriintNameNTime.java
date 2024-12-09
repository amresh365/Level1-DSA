package basicRecursion;

import java.util.Scanner;

public class PriintNameNTime {
	public static void pName(int n)
	{
		if(n==0)
		{
			return;
		}
		pName(n-1);
		System.out.println("A1_G7_M13_K11");
	}
	
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	pName(n);
}
}
