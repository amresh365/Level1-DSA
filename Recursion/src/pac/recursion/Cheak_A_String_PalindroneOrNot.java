package pac.recursion;

public class Cheak_A_String_PalindroneOrNot {
	 public static boolean ispalin=true;
//	 public static int j=s.length();
	public static boolean chekpalindrome(String s,int i,int j)
	{
		// Base case: if the two indexes cross, it's a palindrome  
        if (i >= j) {  
            return true;  
        }  

        // Check if the characters at the current indexes are the same  
        if (s.charAt(i) != s.charAt(j)) {  
            return false;  
        }  

        // Recursive call with next characters  
        return chekpalindrome(s, i+1, j-1);
	 
	}
 public static void main(String[] args) {
	String s="madam";
	
	System.out.println(chekpalindrome(s,0,s.length()-1));
    
}
 
}
