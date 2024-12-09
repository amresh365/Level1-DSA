package Pack.math.dsa.amresh;
import java.util.Scanner;
public class AmstrangNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=s.nextInt();
	int num=n;
	int sum=0;
	while(num>0)
	{   
	     	int ld=num%10;
		    ld=ld*ld*ld;
		    num=num/10;
		    sum+=ld;
	}
	if(n==sum) {
		System.out.println("This is an Amstrong Number");
	}else {
		System.out.println("This is Not A Amstrong Number");
	} 

}
}
