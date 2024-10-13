package pac.recursion;

public class Sum_of_Alement_in_array {
    public static int sum=0;
	public static int sumOfArray(int arr[],int i)
	{
		if(arr.length==i)
		{
			return 0;
		}
		sumOfArray(arr,i+1);
		sum+=arr[i];
		return sum;
	}
public static void main(String[] args) {
	int arr[]= {2,3,4,1,};
	int i=0;
	System.out.println(sumOfArray(arr,i));
}
}
