package pac.recursion;

public class Count_Digit_In_A_Number {
	
public static int countDigit(int n)
{
	if(n==0)
	{
		return 0;
	}
  return countDigit(n/10)+1; 
}
public static void main(String[] args) {
   int n=532232;
   System.out.println(countDigit(n));
}
}
