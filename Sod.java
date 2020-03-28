import java.util.Scanner;

public class Sod {
	static int s=0;
	public static int bin(int n)
	{
		String w="";
		while(n!=0)
		{
			w=w+Integer.toString(n%2);
			n/=2;
		}
		return Integer.parseInt(w);
	}
	public static int count(int n)
	{
		int c=0;
		while(n!=0)
		{
			if(n%10==1)
			{
				c++;
			}
			n/=10;
		}
		return c;
	}
	public static int sum(int n)
	{
		int c=0;
		while(n!=0)
		{
			c=c+n%10;
			n/=10;
		}
		return c;
	}
	  public static void main(String args[]){
	        Scanner s=new Scanner(System.in);
	       // System.out.println("Enter the number of total steps");
	        int n=s.nextInt();
	        //System.out.println("Enter the array elements safe-1 unsafe-0(last index always safe)");
	        int st[]=new int[n];
	        for(int i=0;i<n;i++){
	            st[i]=s.nextInt();
	        }
	        int b[]=new int[n];
	        int sod=0;
	        for(int i=0;i<n;i++)
	        	b[i]=bin(st[i]);
	       for(int i=0;i<n;i++)
	       {
	    	   if(count(b[i])%2==0)
	    		   sod=sod+sum(st[i]);
	       }
	       System.out.println(sod);
	  }
}
