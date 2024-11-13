package pac.recursion;

import java.util.Scanner;

public class FindingPowerOfANumber {
	public static int fPower(int x,int y)
	{
		if(y==0)
		{
			return 1;
		}
		
		return fPower(x,y-1)*x;
		 
		
	}
	
	
public static void main(String[] args) {
	int x,y;
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	y=sc.nextInt();
	int ans=fPower(x,y);
	System.out.println(ans);
	
}
}
