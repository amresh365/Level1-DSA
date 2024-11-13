package recursion1;

import java.util.Scanner;

public class SearchLastIndexInAarray {
	public static int searchIndex(int arr[],int x,int EndIndex)
	{
		if(EndIndex==-1)
		{
			return -1;
		}
		if(arr[EndIndex]==x)
		{
			return EndIndex;
		}
	  int smallAns=searchIndex(arr,x,EndIndex-1);
	  return smallAns;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=s.nextInt();
		System.out.println("Enter the Elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the number tou ewant to be search");
		int x=s.nextInt();
		if(searchIndex(arr,x,arr.length-1)==-1)
		{
			System.out.println("This Alement Is Not present");
		}else {
			System.out.println("The Index is"+searchIndex(arr,x,arr.length-1));
		}
		
	}
}
