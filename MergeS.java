
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class MergeS {
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
		int t=x.nextInt();
		Random r=new Random();
		for(int i=0;i<t;i++)
		{
		int n=x.nextInt();
		int ar[]=new int[n];
		for(int j=0;j<n;j++)
			ar[j]=r.nextInt(1000);
		Date past = new Date();
		sort(ar,0,n-1);
		Date future = new Date();
		 System.out.println("Time (milliseconds) = " + (future.getTime() - past.getTime()));
		for(int p=0;p<n;p++)
		System.out.print(ar[p]+" ");
		System.out.println();
		}
	}

}
