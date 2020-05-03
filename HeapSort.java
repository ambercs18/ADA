

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class HeapSort 
{ 
    public static void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
  
        for (int i=n-1; i>0; i--) 
        { 
          
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            heapify(arr, i, 0); 
        } 
    } 
    static void heapify(int arr[], int n, int i) 
    { 
        int largest = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        // If largest is not root 
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
   
            heapify(arr, n, largest); 
        } 
    } 
  
  
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
   
    public static void main(String args[]) 
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
		sort(ar);
		Date future = new Date();
		 System.out.println("Time (milliseconds) = " + (future.getTime() - past.getTime()));
		for(int p=0;p<n;p++)
		System.out.print(ar[p]+" ");
		System.out.println();
		}
	}
    } 
