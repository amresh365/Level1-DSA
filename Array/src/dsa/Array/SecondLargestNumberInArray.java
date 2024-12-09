package dsa.Array;

public class SecondLargestNumberInArray {

	
	public static int SecondLargest(int arr[])
	{
		
		int max1=arr[0];
		int max2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				max1=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<max1&&arr[i]>max2)
			{
				max2=arr[i];
			}
		}
		
		return max2;
		
	}
	
public static void main(String[] args) {
int arr[]= {93,332,32,323,33,45};
	System.out.println(SecondLargest(arr));
}
}
