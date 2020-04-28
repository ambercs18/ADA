import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class BackSum {
	public static void main(String g[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i+=1)
			ar[i]=x.nextInt();
		int s=x.nextInt();
		subset(ar,s);
	}
	static void subset(int ar[],int s)
	{
		int sub[]=new int[ar.length];
		boolean f=check(ar,sub,s,0,0);
		if(f)
		{
			 System.out.print("\nSum subset for " + s + " : ");
	            StringJoiner sj = new StringJoiner(", ", "[", "]");

	            for (int temp = 0, i = 0; temp != s; temp += ar[i], i++) {
	                sj.add(String.valueOf(ar[i]));
	            }

	            System.out.print(sj.toString());
		}
		else
		{
			 System.out.println("\nSubset not found for sum : " + s);
		}
	}
	static boolean check(int ar[],int sub[],int sum,int i,int si)
	{
		if(i==ar.length)
			return false;
		if(ar[i]==sum)
		{
			sub[si]=ar[i];
			return true;
		}
		for(int j=i;j<ar.length;i++)
		{
			if(ar[j]>sum)
				continue;
			if(ar[j]==sum)
			{
				sub[si]=ar[j];
				return true;
			}
			sub[si]=ar[j];
			if(check(ar,sub,sum-ar[j],j+1,si+1))
				return true;
			
		}
		return false;
	}

}
