package recursion2;
import java.util.HashMap;
import java.util.Scanner;
public class returnKeypad {
	public static String helperFind(int n)
	{
		HashMap<Integer,String> map=new HashMap<>();
		String []keypad= {"abc","def","ghi","jkl","mno","pqrs","tub","wxyz"};
		for(int i=1;i<=9;i++)
		{
			map.put(i,keypad[0]);
		}
		return map.get(n);
	}
	public static String[] findKeyPad(int num)
	{
		if(num<=0)
		{
		   String ans[]= {""};
		   return ans;
		}
		//dividing into small part
		String smallAns[]=findKeyPad(num/10);
		
		//Finding the last digit of number key
		String key=helperFind(num%10);
		
		//Creating new Ans Array to store the result 
		String ans[]=new String[2*smallAns.length];
		int m=0;
		
		//Copying the smallAns dialer key 
		for(int i=0;i<smallAns.length;i++)
		{ 
			ans[m]=smallAns[i];
			m++;
		}
		
		//Concanating smallAns with last digit keys
		for(int i=0;i<key.length();i++) {
			ans[i]=smallAns[i]+key.charAt(i);
		}
		return ans;
		
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The keyPad");
	int keyPad=s.nextInt();
	String out[]=findKeyPad(keyPad);
	for(int i=0;i<out.length;i++)
	{
	 System.out.println(out[i]);	
	}
}
}
