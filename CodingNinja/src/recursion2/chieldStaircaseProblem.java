package recursion2;

import java.util.Scanner;

public class chieldStaircaseProblem {
	public static int findWay(int n) {
		int count=0;
		if(n<=0)
		{  
			count++;
			return count;
		}
	int out=findWay(n-1)+findWay(n-2)+findWay(n-3);
	return out;
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number Of Stairs");
	int n=s.nextInt();
	System.out.println(findWay(n)+" type of way to chield can climb");
	
}
}
