import java.util.*;
import java.util.Date;
public class Ab
{
public static void sort(int ar[])
{	
	for(int i=0;i<ar.length-1;i++)
		{
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int t=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=t;
				}
			
			}
		}

}
	public static void main(String arg[])
	{
		int n;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter number of cases");
		int t=x.nextInt();
		for(int k=0;k<t;k++)
		{
		System.out.println("Enter number of elements");
		n=x.nextInt();
		int ar[]=new int[n];
		//System.out.println("Enter elements");
		Random r=new Random();
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=r.nextInt(8000);
		}
		System.out.println();
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
