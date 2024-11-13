package recursion1;

import java.util.Scanner;

public class ReplaceWithPi {
	public static String replacePI(String str)
	{
		if(str.length()<1)
		{
			return str;
		}
	    String out=replacePI(str.substring(1));
		if(str.charAt(0)=='i')
		{
		 	out="3.14"+out;
		}else if(str.charAt(0)!='p'){
			out=str.charAt(0)+out;
		}
		return out;
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The String");
	String str=s.nextLine();
	
	System.out.println(replacePI(str));
}
}
