package recursion1;

import java.util.Scanner;

public class SumofArray {
public static int sumArray2(int arr[]) {
  if(arr.length==1) {
	  return arr[0];
  } 
  int mid=arr.length/2;
  int arr1[]=new int[mid];
  int arr2[]=new int[arr.length-mid];
  for(int i=0;i<mid;i++)
  {
	   arr1[i]=arr[i];
  }
  for(int i=0;i<arr.length-mid;i++)
  {
	  arr2[i]=arr[i+1];
  }
  
 return sumArray2(arr1)+sumArray2(arr2);
}
 public static int sumArray(int arr[],int i)
 {
	 if(i==arr.length)
	 {
		 return 0;
	 }
	 
	 return sumArray(arr,i+1)+arr[i];
	 
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
//     System.out.println(sumArray(arr,0));
    System.out.println(sumArray2(arr));
	
}
}
