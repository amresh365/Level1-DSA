package dsa.Array;

import java.util.Scanner;

public class LeftRotationByOnePlace {
  public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number of Array:");
   int n=s.nextInt();
   System.out.println("Enter the Element");
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
	   arr[i]=s.nextInt();
   }
   int temp=arr[0];
   for(int i=0;i<n-1;i++)
   {
	   arr[i]=arr[i+1];
   }
   arr[arr.length-1]=temp;
   for(int i=0;i<n;i++)
   {
	   System.out.println(arr[i]);
   }
   
   
}
}
