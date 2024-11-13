package recursion1;

import java.util.Scanner;

public class countDigitInANumber {
 public static int dCount(int n,int count)
 {
	 if(n<=0)
	 {
		 return 0;
	 }
	  n=n/10;
	 return dCount(n,count)+count;
 }
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=s.nextInt();
	System.out.println(dCount(n,1));
}
}
