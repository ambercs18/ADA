import java.util.Scanner;

public class Median {
	static void merge(int arr[], int l, int m, int r) 
    { 
       
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
       
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
      
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
       
  
      
        int i = 0, j = 0; 
  
       
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
     
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
               while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    static void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
           
            int m = (l+r)/2; 
  
           
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
           
            merge(arr, l, m, r); 
        } 
    }
    public static void main(String a[])
    {
    	Scanner x=new Scanner(System.in);
    	int n1=x.nextInt();
    	//int n2=x.nextInt();
    	int ar[]=new int[2*n1];
    	//int arr[]=new int[n1];
    	for(int i=0;i<2*n1;i++)
    		ar[i]=x.nextInt();
    	sort(ar,0,ar.length-1);
    	if(ar.length%2==1)
    		System.out.println(ar[ar.length/2]);
    	else
    	{
    		System.out.println((float)(ar[(ar.length/2)-1]+ar[ar.length/2])/2);
    	}
    	
    			}

}
