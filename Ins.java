import java.util.*;
public class Ins
{
	public static void sort(int ar[])
	{
	int it,j;
		for(int i=0;i<ar.length;i++)
		{
			it=ar[i];
			j=i-1;
			while(j>=0&&ar[j]>it)
			{
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=it;
		}
	}
	public static void main(String arr[])
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter cases");
		int t=x.nextInt();
		Random r=new Random();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter");
			int n=x.nextInt();
			int ar[]=new int[n];
			for(int j=0;j<n;j++)
			ar[j]=r.nextInt(1000);
			//for(int j=0;j<n;j++)
			//System.out.print(ar[j]+" ");
			Date past = new Date();
		sort(ar);
		Date future = new Date();
		 System.out.println("Time (milliseconds) = " + (future.getTime() - past.getTime()));
			for(int j=0;j<n;j++)
			System.out.print(ar[j]+" ");
		}
	}
}
	
			
			
				
			
