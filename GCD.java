import java.util.*;
public class GCD
{
	public static void main(String ar[])
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter 2 positive numbers");
		int a=x.nextInt();
		int b=x.nextInt();
		int r;
		while(b!=0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		System.out.println("GCD of 2 numbers is "+a);
	}
}

