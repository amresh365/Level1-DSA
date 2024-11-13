package recursion1;

import java.util.Scanner;

public class StringToIntiger {
	public static int stringToInt(String str)
	{
		if(str.length()==1)
		{
			return str.charAt(0)-48;//Or we can write at the placeOf 48 '0'
		}
		int smallOut=stringToInt(str.substring(0,str.length()-1));
		int lastDigit=str.charAt(str.length()-1)-48;
		return smallOut*10+lastDigit;
		
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Sring");
	String str=s.nextLine();
	int a=stringToInt(str);
	System.out.println(a);
	
	
}
}
