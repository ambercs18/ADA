import java.util.*;
public class Fact
{
	public static int fact(int n)
	{
		if(n==1)
		return 1;
		else
		return n*fact(n-1);
	}
	public static void main(String ar[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		System.out.print(fact(n));
	}
