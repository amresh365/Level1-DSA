package recursion2;
import java.util.HashMap;
import java.util.Scanner;

public class printkeyPadCombination {
	
	
	public static void printCombination(int input,String outPutSoFar)
	 {
	 String keypad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	 if(input<=0) {
		 System.out.println(outPutSoFar);
	 }
	 String key=keypad[input%10]; 
	 int keyNum=input/10;
	 for(int i=0;i<key.length();i++) 
	 {
		 printCombination(keyNum,outPutSoFar+key.charAt(i));
	 }
	
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The String");
	int input=s.nextInt();
	printCombination(input,"");
	
}
}
