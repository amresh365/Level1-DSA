package pac.recursion;

public class Sum_of_all_digit {
 public static int sum=0;
 public static void sumDigit(int n) {
	 if(n==0)
	 {
		 return ;
	 }
	 sum=sum+n%10;
	 sumDigit(n/10);
 }
public static void main(String[] args) {
	int n= 123;
	sumDigit(n);
	System.out.println(sum);
}
}
