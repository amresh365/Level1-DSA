package string;

public class reverseStringWord {
public static void main(String[] args) {
	String str="My Name is Amresh gupta";
	String res="";
	int i=str.length()-1;
	int end=str.length();
	while(i>=0) {	
		if(str.charAt(i)==' ')
		{
			res=res+str.substring(i+1, end)+" ";
			end=i;
		}
		i--;
	}
	res=res+str.substring(i+1,end);
	System.out.println("The reverse String is:\n"+res);
}
}
