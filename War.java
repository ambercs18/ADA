import java.util.Scanner;

public class War {
	 static void transitiveClosure(int graph[][]) 
	    { 
		 int V=graph.length;
	        int reach[][] = new int[V][V]; 
	        int  i, j, k; 
	        for (i = 0; i < V; i++) 
	            for (j = 0; j < V; j++) 
	                reach[i][j] = graph[i][j]; 
	  
	     
	        for (k = 0; k < V; k++) 
	        { 
	          
	            for (i = 0; i < V; i++) 
	            { 
	           
	                for (j = 0; j < V; j++) 
	                { 
	                   
	                    reach[i][j] = (reach[i][j]!=0) || 
	                             ((reach[i][k]!=0) && (reach[k][j]!=0))?1:0; 
	                } 
	            } 
	        } 
	  
	       
	        printSolution(reach); 
	    } 
	  
	 
	    static void printSolution(int reach[][]) 
	    { 
	        System.out.println("Following matrix is transitive closure"+ 
	                           " of the given graph"); 
	        int V=reach.length;
	        for (int i = 0; i < V; i++) 
	        { 
	            for (int j = 0; j < V; j++) 
	                System.out.print(reach[i][j]+" "); 
	            System.out.println(); 
	        } 
	    } 
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
		 transitiveClosure(ar);
	}

}
