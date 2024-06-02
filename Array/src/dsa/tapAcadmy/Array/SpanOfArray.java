package dsa.tapAcadmy.Array;

public class SpanOfArray {
	public static int SpanArray(int arr[])
	{  int max=arr[0];
	   int min=arr[0];
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]>max)
		   {
			 max=arr[i];  
		   }
		   if(arr[i]<min)
		   {
		    min=arr[i];
		   }
	   }
	   
	   return max-min;
		
	}
	
public static void main(String[] args) {
	
	int arr[]= {93,332,32,323,33,45};
	
	
	System.out.println(SpanArray(arr));
	
}
}
