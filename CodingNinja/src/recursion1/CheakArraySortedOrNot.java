package recursion1;

import java.util.Scanner;

public class CheakArraySortedOrNot {
	//This is first method to cheak 
	public static boolean cheakArray2(int input[])
	{
		if(input.length<=1) 
		{
			return true;
		}
		int smallInput[]=new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			smallInput[i-1]=input[i];
		}
		boolean smallAns=cheakArray2(smallInput);
		if(!smallAns)
		{
			return false;
		}
		if(input[0]<=input[1])
		{
			return true;
		}
		else {
			return false;
		}
	}
	//this is second method to cheak
	public static boolean cheakArray(int arr[],int i)
	{
		if(i==arr.length-1)
		{
			return true;
		}
		if(arr[i]>=arr[i+1])
		{
			return false;
		}
		return cheakArray(arr,i+1);
	}

	//Third method to cheak  And this is Better Solution in Behalf of Space complexit
	public static boolean cheakArray3(int arr[],int startIndex)
	{
		if(startIndex>=arr.length-1)
		{
			return true;
		}
		if(arr[startIndex]>arr[startIndex+1])
		{
			return false;
		}
	   boolean smallAns=cheakArray3(arr,startIndex+1);
	   return smallAns;
	 
	}
	
	public static int[] takeInput(int arr[],int n)
	{    Scanner sc=new Scanner(System.in);
		if(n==-1)
		{
			return arr;
		}
		takeInput(arr,n-1);
		arr[n]=sc.nextInt();
		return arr;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size Of Array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter The Numbers");
		takeInput(arr,n-1);
		System.out.println(cheakArray3(arr,0));
	
//		System.out.println(cheakArray2(arr));
		

	}

}
