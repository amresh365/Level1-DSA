package pac.recursion;

import java.util.Scanner;

public class PrintAllPosiblePatternOfParanthesis {
	static void Paran(char []arr,int n,int i,int o,int c) {
		   if(i==arr.length)
		   {
			  System.out.println(arr);
		   }
		   if(o<n)
		   {
			   arr[i]='(';
			   Paran(arr,n,i+1,o+1,c);
		   }
		   if(c<n)
		   {
			   arr[i]=')';
			   Paran(arr,n,i+1,o,c+1);
		   }
		}
public static void main(String[] args) {
	var sc=new Scanner(System.in);
	int n=sc.nextInt();
	char arr[]=new char[n*2];
	Paran(arr,n,0,0,0);
}
}
