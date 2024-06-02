package dsa.tapAcadmy.Array;

public class inverseOfArray {
	
	public static void Reverse(int arr[])
	{    
		int brr[] = new int[arr.length];
		int v;
       for(int i=0;i<arr.length;i++)
       {
    	 v=arr[i];
    	 brr[v]=i;
       }
       for(int i=0;i<arr.length;i++)
       {
    	  System.out.println(brr[i]);
       }
	}
public static void main(String[] args) {
	int arr[]= {1,4,2,0,4};
	         Reverse(arr);
	
}
}

