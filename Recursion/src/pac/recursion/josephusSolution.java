package pac.recursion;

public class josephusSolution {
public static int jos(int n,int k)
{
	if(n==1)
	{
		return 0;
	}
  return ((jos(n-1,k)+k)%n);	
}
public static void main(String[] args) {
	int n=7;
	int k=3;
	System.out.println(jos(n,k));
}
}