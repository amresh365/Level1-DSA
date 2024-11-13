package recursion1;

import java.util.Scanner;

public class ReplaceCharacterInAstring {
	public static String replaceChar2(String str)
	{
	   if(str.length()==0)
	   {
		   return str;
	   }
	   char firstChar=str.charAt(0);
	   if(firstChar=='b')
	   {
		  firstChar='x';
	   }
	   String smallAns=replaceChar2(str.substring(1));
	   return firstChar+smallAns;
		
	}	
	
	public static String replaceChar(String str,char c1,char c2)
	{
		if(str.length()==0)
		{
			return str;
		}
		String ans="";
		if(str.charAt(0)==c1)
		{
			ans+=c2;
		}else {
			ans+=str.charAt(0);
		}
		String SmallAns=replaceChar(str.substring(1),c1,c2);
		
		return ans+SmallAns;
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The String");
	String str=s.nextLine();
	char c1='b';
	char c2='x';
	//c1 replace by c2
//	System.out.println(replaceChar(str,c1,c2));
	System.out.println(replaceChar2(str));
}
}
