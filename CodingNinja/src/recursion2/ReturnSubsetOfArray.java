package recursion2;

import java.util.Scanner;

public class ReturnSubsetOfArray {
	public static int[][] findSubset(int arr[])
	{
		if(arr.length-arr.length==0)
		{  
			int ans[][]=new int[1][1];
			return ans;
		}
		
		int smallAns[][]=findSubset(arr);
		int ans[][]=new int[2*smallAns.length][];
		
		
		
		return ans;
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number Of Alemengt In the Array");
	int n=s.nextInt();
	System.out.println("Enter The Alements");
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
	  arr[i]=s.nextInt();
	}
	
	int ans[][]=findSubset(arr);
	for(int i=0;i<ans.length;i++)
	{
		for(int j=0;i<ans[0].length;j++)
		{
			System.out.println(ans[i]);
		}
		System.out.println();
		
	}
}
}
