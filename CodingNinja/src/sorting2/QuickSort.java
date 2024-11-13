package sorting2;

public class QuickSort {
	public static int partition(int input[],int si,int ei)
	{   //Finding pivot current element
		int pivot=input[si];
		
		//counting smaller to pivot element 
		int count=0;
		for(int i=si+1;i<=ei;i++)
		{
			if(input[i]<=pivot)
			{
				count++;
			}
		}
		//Finding pivot position
		int pivotIndex=si+count;
		
		//Swapping with current pivot at the original position
		
		input[si]=input[pivotIndex];
		input[pivotIndex]=pivot;
		
		//Arranging greater and smaller element to pivot element 
		int i=si;
		int j=ei;
		while(i<pivotIndex&&j>pivotIndex) {
			 if(input[i]<=pivot)
			{
				i++;
			}else if(input[j]>pivot)
			{
				j--;
			}else 
			{
				int temp;
				temp=input[i];
				input[i]=input[j];
				input[j]=temp;
				i++;
				j--;

			}
		}
		
		//returning current pivot position  index  brown 04043  
		return pivotIndex;
	}
	public static void quickSort(int input[],int si,int ei)
	{
		if(si>=ei)
		{
			return ;
		}
		//Finding pivot position
		int pivotPos=partition(input,si,ei);
		//Performing left and right side sorting from pivot element
		quickSort(input,si,pivotPos-1);
		quickSort(input,pivotPos+1,ei);
	}
	
public static void main(String[] args) {
	int input[]= {8,98,10,70,1};
	quickSort(input,0,input.length-1);
	for(int num:input) {
		System.out.println(num);
	}
}
}
