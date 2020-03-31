import java.util.Scanner;

public class Xor {
	static void findGrid(int n) 
	{ 
	    int [][]arr = new int[n][n]; 
	    int x = 0; 
	    for (int i = 0; i < n / 4; i++) 
	    { 
	        for (int j = 0; j < n / 4; j++)  
	        { 
	            for (int k = 0; k < 4; k++)  
	            { 
	                for (int l = 0; l < 4; l++)  
	                { 
	                    arr[i * 4 + k][j * 4 + l] = x; 
	                    x++; 
	                } 
	            } 
	        } 
	    } 
	  
	    for (int i = 0; i < n; i++)  
	    { 
	        for (int j = 0; j < n; j++)  
	        { 
	            System.out.print(arr[i][j] + " "); 
	        } 
	        System.out.println(" "); 
	    } 
	} 
	  
	public static void main (String[] args) 
	{ 
		Scanner x=new Scanner(System.in);
		
	    int n =x.nextInt();
	      
	    findGrid(n); 
	} 
	} 

