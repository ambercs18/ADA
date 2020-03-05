import java.util.*;
public class Met
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
		sort(s);
		sort(f);
		int c=1;
		int j=1;
		for(int i=0;i<n&&j<n;)
		{
			if(f[i]<=s[j])
			{
			    System.out.println("Meetings possible "+c+1);
				i++;
				j++;
			}
			else
			{
			c++;
			j++;
			}
		}
		//System.out.println("No. of meetings possible "+c);
	}

}
			
