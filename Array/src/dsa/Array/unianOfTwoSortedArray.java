package dsa.Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class unianOfTwoSortedArray {
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 Set<Integer>s1=new HashSet<>();
	   System.out.println("Enter the number of Array:");
	   int n=s.nextInt();
	   System.out.println("Enter 1Array the Element");
	   int arr1[]=new int[n];
	   int arr2[]=new int[n];
	   for(int i=0;i<n;i++)
	   {
		   arr1[i]=s.nextInt();
	   }
	   System.out.println("Enter 2Array the Element");
	   for(int i=0;i<n;i++)
	   {
		   arr2[i]=s.nextInt();
	   }
	   
	   
	   for(int i=0;i<arr1.length;i++)
	   {
		   s1.add(arr1[i]);
	   }
	   for(int i=0;i<arr1.length;i++)
	   {
		   s1.add(arr2[i]);
	   }
	   System.out.println("The Unian of both Arrays");
	   for(int item:s1) {
		   System.out.println(item);
	   }
	   
	   
}
}
