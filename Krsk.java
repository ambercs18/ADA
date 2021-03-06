
import java.util.*; 
  
class Krsk
{ 
  
static int V ; 
static int[] parent; 
static int INF = Integer.MAX_VALUE; 
static int find(int i) 
{ 
    while (parent[i] != i) 
        i = parent[i]; 
    return i; 
} 
   
static void union1(int i, int j) 
{ 
    int a = find(i); 
    int b = find(j); 
    parent[a] = b; 
} 
static void kruskalMST(int cost[][]) 
{ 
    int mincost = 0; 
    for (int i = 0; i < V; i++) 
        parent[i] = i; 
    int edge_count = 0; 
    while (edge_count < V - 1) 
    { 
        int min = INF, a = -1, b = -1; 
        for (int i = 0; i < V; i++) 
        { 
            for (int j = 0; j < V; j++)  
            { 
                if (find(i) != find(j) && cost[i][j] < min)  
                { 
                    min = cost[i][j]; 
                    a = i; 
                    b = j; 
                } 
            } 
        } 
  
        union1(a, b); 
        System.out.printf("Edge %d:(%d, %d) cost:%d \n", 
            edge_count++, a, b, min); 
        mincost += min; 
    } 
    System.out.printf("\n Minimum cost= %d \n", mincost); 
} 
public static void main(String[] args)  
{ 
	Scanner x=new Scanner(System.in);
	V=x.nextInt();
    int cost[][] =new int[V][V];
    parent=new int[V];
    for(int i=0;i<V;i++)
    { 
    	for(int j=0;j<V;j++)
    	{
    		int a=x.nextInt();
    		if(a!=0)
    			cost[i][j]=a;
    		else
    			cost[i][j]=INF;
    		
    	}
    }
    kruskalMST(cost); 
    } 
}