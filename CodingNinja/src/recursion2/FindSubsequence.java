package recursion2;

import java.util.Scanner;

public class FindSubsequence {
	public static String[] findSubSequence(String str)
	{
		if(str.length()==0)
		{
			String ans[]= {""};
			return ans;
		}
		String smallAns[]=findSubSequence(str.substring(1));
		int k=0;
		String ans[]=new String[2*smallAns.length];
		for(int i=0;i<smallAns.length;i++)
		{
			ans[k]=smallAns[i];
			k++;
		}
		for(int i=0;i<smallAns.length;i++)
		{
			ans[k]=str.charAt(0)+smallAns[i];
			k++;
		}
		return ans; 
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=s.nextLine();
	String ans[]=findSubSequence(str);
	for(int i=0;i<ans.length;i++)
	{
	 System.out.println(ans[i]);
	}
	
	
}
}
