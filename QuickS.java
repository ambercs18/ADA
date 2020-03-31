import java.util.Scanner;

public class QuickS {
	public static int partition(int ar[],int l,int h)
	{
		int p=ar[l];
		int i=l;
		int j=h;
		while(i<j)
		{
			 i += 1;
            
             while (i <= h && ar[i] < p) {
                 i += 1;
             }
           
             while (j >= l && ar[j] > p) {
                 j -= 1;
             }
			if(i <= h && i < j)
			{
				int t=ar[i];
				ar[i]=ar[j];
				ar[j]=t;
			}
		}
		int t=ar[l];
		ar[l]=ar[j];
		ar[j]=t;
		return j;
	}
	public static void sort(int ar[],int l,int h)
	{
		if(h>l)
		{
			int j=partition(ar,l,h);
			for(int i=0;i<ar.length;i++)
				System.out.print(ar[i]+" ");
			System.out.println();
			System.out.println(j);
			sort(ar,l,j-1);
			sort(ar,j+1,h);
			
		}
	}
	public static void main(String a[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=x.nextInt();
		//ar[n]=Integer.MAX_VALUE;
		sort(ar,0,n-1);
		/*for(int i=0;i<n;i++)
			System.out.print(ar[i]+" ");*/
		
	}

}
