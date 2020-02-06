import java.util.*;
public class Tower
{
	public static void hanoi(int n,char s,char t,char d)
	{
		if(n==1)
		{
			System.out.println("Move "+n+" disc from "+s+" to "+d);
			return;
		}
		hanoi(n-1,s,d,t);
		System.out.println("Move "+n+" discs from "+s+" to "+d);
		hanoi(n-1,t,s,d);
	}
	public static void main(String ar[])
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter number of discs");
		int n=x.nextInt();
		hanoi(n,'A','B','C');
	}
}
	

		
  
