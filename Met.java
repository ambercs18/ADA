import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Met {
	public static void main(String a[])
	{
		int n=6;
		int s[]=new int[n];
		int f[]=new int [n];
		int p[]=new int [n+1];
		p[0]=0;
		Scanner x=new Scanner(System.in);
		for(int i=0;i<n;i++)
			s[i]=x.nextInt();
		for(int i=0;i<n;i++)
			f[i]=x.nextInt();
		for(int i=1;i<=n;i++)
			p[i]=i;
		Arrays.sort(f);
		ArrayList<Integer> l=new ArrayList<>();
		l.add(p[0]+1);
		int lim=f[p[1]-1];
		for(int i=1;i<n;i++)
		{
			if(s[i]>=lim)
			{
				l.add(i+1);
				lim=f[i];
			}
		}
		System.out.println(l);
	}

}
