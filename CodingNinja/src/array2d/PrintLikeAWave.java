package array2d;

import java.util.Scanner;

public class PrintLikeAWave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs= new Scanner(System.in);
		int arr[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{   System.out.println("Enter The "+i+" Row Element");
			for(int j=0;j<3;j++)
			{  
				arr[i][j]=cs.nextInt();
			}
		}
		System.out.println("The entered Alement Is");	
     for(int i=0;i<3;i++) {
    	
    	if(i%2==0)
    	{
    		 for(int j=0;j<3;j++)
        	 {
        		 System.out.print(arr[j][i]);
        	 }	
    	}
    	else {
    		for(int j=2;j>=0;j--)
       	 {
       		 System.out.print(arr[j][i]);
       	 }	
    	}
     }
	}
}
