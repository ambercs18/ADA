import java.util.ArrayList;
import java.util.Scanner;

public class Part {
	static int max=0;
	public static int sum(ArrayList<Integer> ar)
	{
		int s=0;
		for(int i=0;i<ar.size();i++)
			s=s+ar.get(i);
		return s;
	}
    public static int min(ArrayList<Integer> ar)
    {
    	int m=Integer.MAX_VALUE;
    	int p=0;
    	for(int i=0;i<ar.size();i++)
    	{
    		if(m>ar.get(i))
    		{
    			m=ar.get(i);
    			p=i;
    		}
    	}
    	max+=m;
    	return p;
    	
    	
    }
	public static void main(String a[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		ArrayList<Integer> ar=new ArrayList<>();
		for(int i=0;i<n;i++)
			ar.add(x.nextInt());
		//System.out.print(ar);
		int p=0;
		max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(max<ar.get(i))
			{
				p=i;
				max=ar.get(i);
			}
		}
		ar.remove(p);
		if(sum(ar)==max)
			System.out.println("True");
		else if(sum(ar)>max)
		{
			int f=0;
			while(!(max>sum(ar)))
			{
			int b=min(ar);
			ar.remove(b);
			//max+=b;
			if(sum(ar)==max)
			{
				f=1;
				break;
			}
			}
			if(f==1)
				System.out.println("True");
			else
				System.out.println("False");
			
		}
		else
			System.out.println("False");
		
	}

}
