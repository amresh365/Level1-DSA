package recursion2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class returnSubset {
	public static int[][] findSubset(int arr[],int i)
	{
	  if(i==arr.length)
	  {
		  return new int[0][0];
	  }
	}
public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);  
      System.out.println("Enter the number of elements in the array:");  
      int n = s.nextInt();  
      int arr[] = new int[n];  

      System.out.println("Enter the elements:");  
      for (int i = 0; i < n; i++) {  
          arr[i] = s.nextInt();  
      }  

      findSubset(arr,0);  

      System.out.println("Subsets:");  
      
}
}
