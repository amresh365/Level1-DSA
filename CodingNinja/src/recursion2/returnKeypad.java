package recursion2;
import java.util.Scanner;
public class returnKeypad {
	
	public static String helperFind(int n)
	{
		
		String []keypad= {"","","abc","def","ghi","jkl","mno","pqrs","tub","wxyz"};
		return keypad[n];
	}
	public static String[] findKeyPad(int num)
	{
		if(num<=0)
		{
		   String ans[]= {""};
		   return ans;
		}
		int lastNum=num%10;
		//dividing into small part
		String smallAns[]=findKeyPad(num/10);
		
		//Finding the last digit of number key
		String key=helperFind(lastNum);

		//Creating new Ans Array to store the result 
		String ans[]=new String[smallAns.length*key.length()];
		
		for(int i=0;i<smallAns.length;i++)
		{
			for(int j=0;j<key.length();j++)
			{
				ans[j]=key.charAt(j)+smallAns[i];
			}
		}
		
		return ans;
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The keyPad");
	int keyPad=s.nextInt();
	int length=0;
	
	String out[]=findKeyPad(keyPad);
	for(int i=0;i<out.length;i++)
	{
	 System.out.println(out[i]);	
	}
}
}
