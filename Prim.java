import java.util.ArrayList;
import java.util.Scanner;

public class Prim {
	 static int minKey(int key[], Boolean mstSet[]) 
	    { 
	       int V=key.length;
	        int min = Integer.MAX_VALUE, min_index = -1; 
	  
	        for (int v = 0; v < V; v++) 
	            if (mstSet[v] == false && key[v] < min) { 
	                min = key[v]; 
	                min_index = v; 
	            } 
	  
	        return min_index; 
	    } 
	  
	    static void printMST(int parent[], int graph[][]) 
	    { 
	    	int V=graph.length;
	    	int s=0;
	        for (int i = 1; i < V; i++) 
	           s+= graph[i][parent[i]];
	        System.out.print("Cost of Minimum Spanning tree = "+s);
	    } 
	  
	    static void primMST(int graph[][]) 
	    { 
	    	int V=graph.length;
	  
	        int parent[] = new int[V]; 
	        int key[] = new int[V]; 
	 
	        Boolean mstSet[] = new Boolean[V]; 
	        for (int i = 0; i < V; i++) { 
	            key[i] = Integer.MAX_VALUE; 
	            mstSet[i] = false; 
	        } 
	   
	        key[0] = 0;
	        
	        parent[0] = -1; 
	  
	         
	        for (int count = 0; count < V - 1; count++) { 
	            int u = minKey(key, mstSet); 
	            mstSet[u] = true; 
	            for (int v = 0; v < V; v++) 
	                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) { 
	                    parent[v] = u; 
	                    key[v] = graph[u][v]; 
	                } 
	        } 
	  
	        
	        printMST(parent, graph); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        Scanner x=new Scanner(System.in);
	        int n=x.nextInt();
	        
	        int graph[][] = new int[n][n];
	        for(int i=0;i<n;i++)
	        {
	        	for(int j=0;j<n;j++)
	        		graph[i][j]=x.nextInt();
	        }
	        primMST(graph); 
	    } 
	} 


