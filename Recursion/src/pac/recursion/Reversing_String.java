package pac.recursion;

public class Reversing_String {
 public static String reverseString(String s,String r,int i)
 {   
	 if(i<0)
	 {
		 return r;
	 }
	return  reverseString(s,r+s.charAt(i),i-1); 
 }
public static void main(String[] args) {
	String s="amresh";
	System.out.println(reverseString(s,"",s.length()-1));
}
}
