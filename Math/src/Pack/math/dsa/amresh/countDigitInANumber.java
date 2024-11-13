package Pack.math.dsa.amresh;

import java.util.Scanner;

public class countDigitInANumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=s.nextInt();
	int count=0;
	while(n>0)
	{   count++;
		n=n/10;
		
	}
	System.out.println(count);
}
}
