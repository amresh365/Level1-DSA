package recursion2;

import java.util.Scanner;

public class PrintSubsequenceOfAString {
	public static void printSubsequences(String input,String outPutSofar)
	{
		if(input.length()==0)
		{
			System.out.println(outPutSofar);
			return;
		}
		printSubsequences(input.substring(1),outPutSofar);
		printSubsequences(input.substring(1),outPutSofar+input.charAt(0));
		
	}
	public static void printSubsequences(String str)
	{
		printSubsequences(str,"");
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Ente the String");
	String str=s.nextLine();
	printSubsequences(str);
}
}
