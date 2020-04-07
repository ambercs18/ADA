
public class Pal {
	public static int check(String st)
	{
		String w="";
		for(int i=st.length()-1;i>=0;i--)
			w=w+st.charAt(i);
		if(w.equals(st))
			return 1;
		else
			return 0;
	}
	public static int fun(char st[],int i,int j)
	{
		if(i==j)
			return 1;
		else if(st[i]==st[j]&&i+1==j)
			return 2;
		else if(st[i]==st[j])
			return fun(st,i+1,j-1)+2;
		else
			return Math.max(fun(st,i+1,j),fun(st,i,j-1));
	}
	public static void main(String a[])
	{
		String s="BBABCBCAB";
	   // int l=fun(s.toCharArray(),0,s.length());
	    System.out.print(fun(s.toCharArray(),0,s.length()-1));
	}

}
