package recursion1;

import java.util.Scanner;

public class CheakStringPalindrome {
	public static boolean cheakPalin(String str,int startIndex,int endIndex)
	{
		if(startIndex>=endIndex)
		{
			return true;
		}
		if(str.charAt(startIndex)!=str.charAt(endIndex))
		{
			return false;
		}
	   return cheakPalin(str,startIndex+1,endIndex-1);
		
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=s.nextLine();
	System.out.println(cheakPalin(str,0,str.length()-1));
	
	
}
}
