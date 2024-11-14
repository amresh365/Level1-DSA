package Pattarns;
public class verticalStarPrintWithUnderSpace {
public static void main(String[] args) {
  for(int i=0;i<4;i++)
  {
    
     if(i>=1&&i<=2)    	 
     {    
    	 System.out.print("*"); 
    	 for(int k=0;k<2;k++)
    	 {
    		 System.out.print(" ");
    	 }
    	 System.out.print("*");
    	 System.out.println();
    	 for(int k=0;k<4;k++)
    	 {
    		 System.out.print(""); 
    	 }
    	 
     }
     else {
     for(int j=0;j<4;j++)
     {
    	 System.out.print("*");
     }
     System.out.println();
	 for(int k=0;k<4;k++)
	 {
		 System.out.print(""); 
	 }
     }
     System.out.println();
     
  }
  
}
}