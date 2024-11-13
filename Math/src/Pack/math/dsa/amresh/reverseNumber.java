package Pack.math.dsa.amresh;

import java.util.Scanner;

public class reverseNumber {
public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter The Number");
  int n=s.nextInt();
  int rev=0;
  
  while(n>0)
  {
	  int last=n%10;
	  rev=rev*10+last;
	  n=n/10;
  }
  System.out.println(rev);
}
}
