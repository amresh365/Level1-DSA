package dsa.Array;

public class SearchAalementBitonicArray {
	
	public static int bitonicalement(int arr[],int target)
	{
		int index=0;
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				index=i;
			}
		}
		if(max==target)
		{
			return index;
		}
		else if(target>max){
			    int low=index;
			    int high=arr.length-1;
	  
			while(low<=high)
			{
				int mid=(low+high)/2;
				if(target==arr[mid])
				{
					return mid;
				}
				else if(target<arr[mid])
				{
					high=mid-1;
				}
				else {
					low=mid+1;
				}	
			}
		}
			
	else {
		int low=0;
		int high=index;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(target==arr[mid])
			{
				return mid;
			}
			else if(target<arr[mid])
			{
				high=mid-1;
			}
			else {
				low=mid+1;
			}	
				
		}
		
	}    	
	
	   return 0;
	}
	
	public static void main(String[] args) {
		int arr[]= {7,6,5,4,3,5,6,7,8,9,10};
		System.out.println(bitonicalement(arr,5));
		
	}
	
}	