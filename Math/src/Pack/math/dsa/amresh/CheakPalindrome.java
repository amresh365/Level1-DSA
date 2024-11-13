package Pack.math.dsa.amresh;

import java.util.Scanner;

public class CheakPalindrome {
public static void main(String[] args) {
	
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter The Number");
	  int n=s.nextInt();
	  int orignalNum=n;
	  int rev=0;
	  while(n>0)
	  {
		  int last=n%10;
		  rev=rev*10+last;
		  n=n/10;
	  }
  if(orignalNum==rev)
  {
	 System.out.println("This number is Palindrome");
  }else {
	  System.out.println("This number not a Palindrome"); 
  }

}
}
