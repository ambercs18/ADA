import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class minCoin {
	
	static ArrayList<Integer> bb=new ArrayList<>();
	static HashMap<Integer,Integer> b=new HashMap<>();
	static int min(int n)
	{
		int m=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(m>bb.get(i))
				m=bb.get(i);
		}
		return m;
	}
	static void fun(int ar[],int n,int c)
	{
		int s=0;
		while(n!=0)
		{
		for(int i=0;i<ar.length;i++)
		{
			int d=n/ar[i];
			bb.add(d);
			b.put(d,ar[i]);
	    }
		int x=min(c);
		n=n-x*b.get(x);
		System.out.println("Coin = "+b.get(x)+" Quantity = "+x);
		s=s+x;
		//b.clear();	
		}
		System.out.print("Minimum number of coins required = "+s);
	}
	public static void main(String a[])
	{
		Scanner x=new Scanner (System.in);
		int n=x.nextInt();
		int c=x.nextInt();
		int ar[]=new int[c];
		for(int i=0;i<c;i++)
			ar[i]=x.nextInt();	
		fun(ar,n,c);
	}

}
