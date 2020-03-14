import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Lexi {
	static int ar[][];
	static boolean v[];
	static  LinkedList<Integer> l = new LinkedList<Integer>();
	static ArrayList<Integer> o=new ArrayList<>();
     static int c[];
	public static void main(String a[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		ar=new int[n][n];
		v=new boolean[n];
		c=new int[n];
		System.out.println("Enter matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				ar[i][j]=x.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c[i]=0;
		}
		Top();

	}
     	public static void Top()
	{
		int cnt=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j][i]==1)
				{
					c[i]++;
				}
			}
		}
		int p;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==0)
				l.add(i);
			while(l.size()!=0)
			{
				p=l.poll();
				//System.out.println(p);
				o.add(p);
				cnt++;
				for(int j=0;j<ar.length;j++)
				{
					if(ar[p][j]==1)
					{
						c[j]--;
						if(c[j]==0)
							l.add(j);
					}
				}
				
			}
		}
		if(cnt!=ar.length)
			System.out.print("Not Possible");
		else
			System.out.println(o);
		
	}

}
