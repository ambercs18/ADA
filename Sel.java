import java.util.*;
public class Sel
{
	public static void sort(int ar[])
	{
		for(int i=0;i<ar.length-1;i++)
		{
			int min=ar[i];
			int pos=i;
			for(int j=i+1;j<ar.length-1;j++)
			{
				if(ar[j]<min)
				{
					min=ar[j];
					pos=j;
				}
			}
			int t=ar[i];
			ar[i]=ar[pos];
			ar[pos]=t;
			}
		}
	public static void main(String arg[])
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter cases");
		int t=x.nextInt();
		Random r=new Random();
		for(int i=0;i<t;i++)
		{
		System.out.println("Enter elements");
		int n=x.nextInt();
		int ar[]=new int[n];
		for(int j=0;j<n;j++)
		ar[j]=r.nextInt(2000);
		Date past = new Date();
		sort(ar);
		Date future = new Date();
		 System.out.println("Time (milliseconds) = " + (future.getTime() - past.getTime()));
		for(int p=0;p<n;p++)
		System.out.print(ar[p]+" ");
		System.out.println();
		}
	}
}
		 
