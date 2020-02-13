import java.util.*;
public class Abc
{
public static void sort(int ar[])
{	
	for(int i=0;i<ar.length-1;i++)
		{
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j]<ar[j+1])
				{
					int t=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=t;
				}
			
			}
		}

}
public static void main(String arg[])
{
	Scanner x=new Scanner(System.in);
	System.out.println("Enter number of elements");
	int n=x.nextInt();
	int ar[]=new int[n];
   System.out.println("Enter elements");
   for(int i=0;i<ar.length;i++)
   ar[i]=x.nextInt();
   System.out.println("Enter value of k");
   int k=x.nextInt();
   if(k<=n)
   {
   sort(ar);
   for(int i=0;i<k;i++)
   System.out.print(ar[i]+" ");
   }
   else
   System.out.print("INVALID");
  }
  }
