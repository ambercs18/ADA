import java.util.*;
public class Search
{
	public static void main(String ar[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=x.nextInt();
		}
		System.out.println("Enter the key element");
		int k=x.nextInt();
		int f=0;
		int l=n-1;
		int m=0;
		int j=-1;
		int i=-1;
		int c=1;
		while(l>f)
		{
			m=(l+f)/2;
			if(arr[m]>k)
				l=m;
			else if(arr[m]<k)
				f=m;
			else if(arr[m]==k)
			{
				if(arr[m]==arr[m-1])
				{
					for(i=m-1;i>=0;i--)
					{
						if(arr[i]==k)
						{
							c++;
						}
					}
				}
				if(arr[m]==arr[m+1])
				{
					for(j=m+1;j<arr.length;j++)
					{
						if(arr[j]==k)
						c++;
					}
				}
				break;
			}
			else
			break;
		}
		if(i==-1&&j==-1&&arr[m]==k)
		System.out.println("Found");
		else if(i==-1&&j==-1)
		System.out.println(" Not Found");
		else if(i==-1&&arr[m]==k)
		System.out.println("Found last at "+(j-1)+",first at "+(m+1)+" and count "+c);
		else if(j==-1&&arr[m]==k)
		System.out.println("Found at"+i+"and "+m);
		else
		System.out.println("First occurence of key is "+i+", last occurence of key is "+j+" and count of key is "+c);
		}
}
	
							
		 
	 
