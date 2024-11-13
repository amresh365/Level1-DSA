package recursion1;

import java.util.Scanner;

public class RemoveDuplicateFromAstring {
	public static String removeDuplicate(String str)
	{
      if(str.length()==0)
      {
    	  return str;
      }
      char ans=str.charAt(0);
      String  res="";
      String SmallAns=removeDuplicate(str.substring(1));
      if(!SmallAns.contains(Character.toString(ans)))
      {
    	  res+=ans;
      }
      
     return res+SmallAns;
     
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=s.nextLine();
	System.out.println(removeDuplicate(str));
}
}
