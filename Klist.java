import java.util.*;
class Klist { 
  
    static int N; 
    static int ptr[] = new int[501]; 
    static void findSmallestRange(int arr[][], int n, int k) 
    { 
        int i, minval, maxval, minrange, minel = 0, maxel = 0, flag, minind; 
        for (i = 0; i <= k; i++) { 
            ptr[i] = 0; 
        } 
  
        minrange = Integer.MAX_VALUE; 
  
        while (true) { 
 
            minind = -1; 
            minval = Integer.MAX_VALUE; 
            maxval = Integer.MIN_VALUE; 
            flag = 0; 
            for (i = 0; i < k; i++) { 
         
                if (ptr[i] == n) { 
                    flag = 1; 
                    break; 
                } 

                if (ptr[i] < n && arr[i][ptr[i]] < minval) { 
                    minind = i;
                    minval = arr[i][ptr[i]]; 
                } 
                if (ptr[i] < n && arr[i][ptr[i]] > maxval) { 
                    maxval = arr[i][ptr[i]]; 
                } 
            } 
  
          
            if (flag == 1) { 
                break; 
            } 
  
            ptr[minind]++; 
  
     
            if ((maxval - minval) < minrange) { 
                minel = minval; 
                maxel = maxval; 
                minrange = maxel - minel; 
            } 
        } 
        System.out.printf("The smallest range is [%d, %d]\n", minel, maxel); 
    } 
    public static void main(String[] args) 
    { 
       Scanner x=new Scanner(System.in);
       N=x.nextInt();
       int arr[][]=new int[N][N];
       for(int i=0;i<N;i++)
       {
    	   for(int j=0;j<N;j++)
    		   arr[i][j]=x.nextInt();
       }
  
        int k = arr.length; 
  
        findSmallestRange(arr, N, k); 
    } 
} 
