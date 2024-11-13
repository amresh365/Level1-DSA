package recursion1;

import java.util.Scanner;

public class MultiplicationusingRecursion {
	public static int mul(int x,int y)
	{
		if(x==0)
		{
			return 0;
		}
		return mul(x-1,y)+y;
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the First Number");
	int x=s.nextInt();
	System.out.println("Enter Rhe Seacond Number");
    int y=s.nextInt();
    System.out.println(mul(x,y));
    
}
}
