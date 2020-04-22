import java.util.Scanner;

public class Rod {
	public static void main(String agr[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=x.nextInt();
		int m=0;
		int v[]=new int[n+1];
		v[0]=0;
		for(int i=1;i<=n;i++)
		{
	        m=Integer.MIN_VALUE;
			for(int j=0;j<i;j++)
			{
			m=Math.max(m,ar[j]+v[i-j-1]);
			}
			v[i]=m;
		}
		System.out.println(v[n]);
	}

}
