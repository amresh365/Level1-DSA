package recursion2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombinationOfPhoneNumber {
	 public static List<String>allans=new ArrayList<>();  

	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number ");
		String num=s.nextLine();
		letterCombinations(num);
		for(int i=0;i<allans.size();i++)
		{
			System.out.println(allans.get(i));
		}
		
	}
	public static void allpairCombination(String digits,String ans)
	{
	 String keypad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	if(digits.length()==0)
	{   allans.add(ans);
	    return ;
	}
	String key=keypad[digits.charAt(0)-48];
	for(int i=0;i<key.length();i++)
	{
	allpairCombination(digits.substring(1),ans+key.charAt(i));
	}
	// return allans;
	}

	    public static void letterCombinations(String digits) {
	        List<String>all=new ArrayList<>();  
	        if(digits.length()>0)
	        {
	         allpairCombination(digits,"");
	        }
	        
	    }
	}


