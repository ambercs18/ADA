import java.util.*;
public class Mettt
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
	public static int min(int ar[])
	{
		int min=ar[0];
		int p=0;
		for(int i=0;i<ar.length;i++)
		{
			if(min>ar[i])
			{
				min=ar[i];
				p=i;
			}
		}
		return p;			
}
	public static void main(String arr[])
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter no. of meetings");
		int n=x.nextInt();
		int s[]=new int[n];
		int f[]=new int[n];
		System.out.println("Enter start time");
		for(int i=0;i<n;i++)
		s[i]=x.nextInt();
		System.out.println("Enter end time");
		for(int i=0;i<n;i++)
		f[i]=x.nextInt();
		int c=0;
		int y=0;
		for(int i=0;i<n;i++)
		{
			int p=min(s);
			s[p]=9999;
			if(f[p]<=s[min(s)]&&f[p]>=y)
			{
				c++;
				s[min(s)]=9999;
				y=f[p];
			}
				
	}
	System.out.println("Meetings Possible "+c);
	}

}
			
