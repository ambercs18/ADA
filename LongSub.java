import java.util.Scanner;

public class LongSub {
	static int fun(int i,int ar[])
	{
		int m=Integer.MIN_VALUE;
		for(int p=0;p<ar.length;p++)
		{
			int c=1;
			for(int j=p+1;j<ar.length;j++)
			{
				//int t=ar[j];
				if(ar[j]>ar[p])
				{
					ar[p]=ar[j];
					c++;
				}
			}
			m=Math.max(m,c);
			
		}
		return m;
	}
	public static void main(String agr[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=x.nextInt();
		
		//fun(0,ar);
		System.out.println(fun(0,ar));
		
	}

}
