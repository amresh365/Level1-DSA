package Pack.math.dsa.amresh;

import java.util.Scanner;

public class sumOfAllDigitInANumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Number ");
	int num=s.nextInt();
	int res=0;
	while(num!=0)
	{
		res+=num%10;
		num=num/10;
		
	}
	System.out.println(res);
	
}
}
