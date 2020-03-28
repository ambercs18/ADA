import java.util.Scanner;

public class FW {
	public static void main(String a[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int ar[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				ar[i][j]=x.nextInt();
			}
		}
		int b[][]=new int[n][n];
		for(int k=0;k<n;k++)
		{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==k||j==k)
				{
					continue;
					//b[i][j]=ar[i][j];
				}
				else
				{
					int p=ar[i][j];
					if(ar[i][k]==-1||ar[k][j]==-1)
						ar[i][j]=p;
					else
					{
						int q=ar[i][k]+ar[k][j];
						if(p==-1)
							ar[i][j]=q;
						else
						ar[i][j]=Math.min(p,q);
					}
					
				}
			}
		}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
