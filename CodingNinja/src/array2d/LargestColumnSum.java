package array2d;

import java.util.Scanner;
public class LargestColumnSum {
	
 public  static int[][] takeInput(){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number Of Rows");
	 int row=sc.nextInt();
	 System.out.println("Enter the Number Column");
	 int column=sc.nextInt();
	 int arr[][]=new int[row][column];
	 for(int i=0;i<row;i++)
		{   System.out.println("Enter The "+i+" Row Element");
			for(int j=0;j<column;j++)
			{  
				arr[i][j]=sc.nextInt();
			}
		}
	return arr;
 }
 
 
 
public static void main(String[] args) {
  int[][] arr=takeInput();
  int max=Integer.MIN_VALUE;
  int sum=0;
  for(int i=0;i<arr.length;i++)
  {
	  for(int j=0;j<arr[0].length;j++)
	  {
		  sum+=arr[j][i];
	  }
	  if(sum>max)
	  {
		  max=sum;
	  }
	  sum=0;
  }
  System.out.println("The maximum column sum is"+max);
}
}
