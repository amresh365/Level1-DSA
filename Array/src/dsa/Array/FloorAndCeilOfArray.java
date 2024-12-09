package dsa.Array;

public class FloorAndCeilOfArray {
public static int Ceil(int key,int arr[])
{
	int mid=0;
	int low=0;
	int high=arr.length-1;
	
	while(low<=high)
	{
		 mid=(low+high)/2;
		 
		if(arr[mid]==key)
		{
			return arr[mid];
		}
		if(key<arr[mid])
		{
			high=mid-1;
		}
		else {
			low=mid+1;
		}
	}
	return  arr[low];
}


public static int floor(int key,int arr[])
{
	int low=0;
	int high=arr.length-1;
	
	while(low<=high)
	{
		int mid=(low+high)/2;
		if(arr[mid]==key)
		{
			return arr[mid];
		}
		else if(key<arr[mid])
		{
			high=mid-1;
		}
		else {
			low=mid+1;
		}
	}
	
	return arr[high];
	
}


public static void main(String[] args) {
	int arr[]= {2,32,3,33,4,55,33};
	int key=32;
	System.out.println(Ceil(key,arr));
	System.out.println(floor(key,arr));
}
}
