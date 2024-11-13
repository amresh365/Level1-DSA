package recursion1;

import java.util.Scanner;

public class SearchInaArray {
	public static boolean searchElement(int arr[],int target)
	{
		if(arr.length<=1)
		{
			return false;
		}
	    if(arr[0]==target)
	    {
	    	return true;
	    }
	    int arr2[]=new int[arr.length-1];
	    for(int i=0;i<arr.length-1;i++) {
	    	arr2[i]=arr[i+1]; 
	    }
	   return searchElement(arr2,target);
	   
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Size Of Araay");
	int n=s.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter The Element In The Array");
    for(int i=0;i<n;i++) {
    	arr[i]=s.nextInt();
    }
    System.out.println("Enter the Target");
	int target=s.nextInt();
    System.out.println(searchElement(arr,target));
    
}
}
