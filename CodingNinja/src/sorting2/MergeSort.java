package sorting2;
public class MergeSort {
	public static void merge(int input[],int sI,int eI){
		//Creating new Array of current size 
		int ans[]=new int[eI-sI+1];
		//calculating mid point for dividing purpose
		int mid=(sI+eI)/2;
		int i=sI;
		int j=mid+1;
		int k=0;
		//Camparing both part from mid
		while(i<=mid&&j<=eI)
		{
			if(input[i]<input[j])
			{
				ans[k]=input[i];
				i++;
				k++;
			}else {
				ans[k]=input[j];
				j++;
				k++;
			}
		}
		
		while(i<=mid)
		{
			ans[k]=input[i];
			i++;
			k++;
		}
		while(j<=eI)
		{
			ans[k]=input[j];
			j++;
			k++;
		}
		
		for(int index=0;index<ans.length;index++)
		{
			input[sI+index]=ans[index];
			
		}
	}
	public static void mergeSort(int input[],int sI,int eI){
		//When Starting index is greater ending Index then control will return
		if(sI>=eI)
		{
			return;
		}
		//Calculating mid of the current array
	    int mid=(sI+eI)/2;
	    //Dividing in the two part and sorting both part independently
	    mergeSort(input,sI,mid);
	    mergeSort(input,mid+1,eI);
	    //Then merging both part
	    merge(input,sI,eI);
	}
	
public static void main(String[] args) {
	int input[]= {8,98,10,70,1};
	mergeSort(input,0,input.length-1);
	
	for(int i=0;i<input.length;i++)
	{
		System.out.println(input[i]);
	}
}
}