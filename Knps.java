import java.util.Scanner;

public class Knps {
	public static int solve(int v[],int w[],int wt,int n)
	{
		if(wt==0||n==0)
			return 0;
		else
		{
			if(w[n-1]>wt)
				return solve(v,w,wt,n-1);
			else
				return Math.max(v[n-1]+solve(v,w,wt-w[n-1],n-1),solve(v,w,wt,n-1));
		}
	}
	public static void main(String a[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int v[]=new int[n];
		int w[]=new int[n];
		System.out.println("Enter value of items");
		for(int i=0;i<n;i++)
			v[i]=x.nextInt();
		for(int i=0;i<n;i++)
			w[i]=x.nextInt();
		System.out.println("Enter max wieght");
		int wt=x.nextInt();
		System.out.print(solve(v,w,wt,v.length));
	}

}
