/*import java.util.ArrayList;
import java.util.Scanner;

public class Dij {
	static int mi=0;
	static int min(ArrayList<Integer> ar,int n,ArrayList<Integer> v)
	{
		int m=Integer.MAX_VALUE;
		int p=0;
		for(int i=0;i<n;i++)
		{
			if(v.contains(i)==false&&ar.get(i)<m)
			{
				m=ar.get(i);
				p=i;
			}
		}
		mi=m;
		return p;
	}
	public static void main(String ag[])
	{
		Scanner x=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> v=new ArrayList<>();
		
		int n=x.nextInt();
		int ar[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				ar[i][j]=x.nextInt();
		}
		a.add(0);
		for(int i=1;i<n;i++)
			a.add(i,Integer.MAX_VALUE);
		int c;
		int l=0;
		while(l!=n-1)
		{
			if(v.size()==0)
			{
				//v.add(0);
				c=0;
			}
			else
			c=min(a,n,v);
			v.add(c);
			l++;
			/*if(v.contains(c)==false||c==0)
				v.add(c);*/
			/*for(int i=0;i<ar.length;i++)
			{
				if(ar[c][i]!=0&&a.get(c)+ar[c][i]<a.get(i)&&v.contains(i)==false)
					a.add(i,a.get(c)+ar[c][i]);		
			}
			//a.add(c,Integer.MAX_VALUE);
		}
		System.out.print(a);
		
		
		
	}

}*/
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
public class Dij { 
    static  int V; 
    int minDistance(int dist[], Boolean sptSet[]) 
    { 
        int min = Integer.MAX_VALUE, min_index = -1; 
  
        for (int v = 0; v < V; v++) 
            if (sptSet[v] == false && dist[v] <= min) { 
                min = dist[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    } 
    void printSolution(int dist[]) 
    { 
        System.out.println("Vertex \t\t Distance from Source"); 
        for (int i = 0; i < V; i++) 
            System.out.println(i + " \t\t " + dist[i]); 
    } 
    void dijkstra(int graph[][], int src) 
    { 
        int dist[] = new int[V];
        Boolean sptSet[] = new Boolean[V]; 
        for (int i = 0; i < V; i++) { 
            dist[i] = Integer.MAX_VALUE; 
            sptSet[i] = false; 
        } 
  
      
        dist[src] = 0; 
  
       
        for (int count = 0; count < V - 1; count++) { 
          
            int u = minDistance(dist, sptSet); 
  
           
            sptSet[u] = true; 
  
            for (int v = 0; v < V; v++) 
  
               
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) 
                    dist[v] = dist[u] + graph[u][v]; 
        } 
  
       
        printSolution(dist); 
    } 
  
   
    public static void main(String[] args) 
    { 
    	Scanner x=new Scanner(System.in);
    	V=x.nextInt();
    	int graph[][]=new int[V][V];
    	for(int i=0;i<V;i++)
    	{
    		for(int j=0;j<V;j++)
    			graph[i][j]=x.nextInt();
    			
    	}
       
 
        Dij t=new Dij(); 
        t.dijkstra(graph, 0); 
    } 
}

