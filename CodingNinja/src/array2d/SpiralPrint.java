package array2d;

import java.util.Scanner;

public class SpiralPrint {
	
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
	int arr[][]=takeInput();
	int cs=0;
	int re=arr.length-1;
	int rs=0;
	int ce=arr[0].length-1;
	int count=0;
	System.out.println("The Spiral Matrix Is");
	while(count!=arr.length*arr[0].length) {
		
		//Traverse Right
		for(int i=cs;i<=ce;i++) {
			System.out.println(arr[rs][i]);
			count++;
		}
		// rs row updation  
		rs=rs+1;
		//Traverse Down
         for(int i=rs;i<=re;i++) {
		
        	 System.out.println(arr[i][ce]);		
        	 count++;
		}
     	//ce col updation
         ce=ce-1;	
         //Traverse left
         for(int i=ce;i>=cs;i--) {
        	 System.out.println(arr[re][i]);
        	 count++;
 		}
       //re row end updation
       
    	 re=re-1;
      //Traverse up
         for(int i=re;i>=rs;i--) {
        	 System.out.println(arr[i][cs]);
        	 count++;
 		}
       //updation of col start 
			cs=cs+1;
	}
}
}
