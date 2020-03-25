import java.util.*; 
public class Merge
{ 
   
    public static void mergeSort3Way(int gArray[]) 
    { 
        
        if (gArray == null) 
            return; 
  
        
        int fArray[] = new int[gArray.length]; 

        for (int i = 0; i < fArray.length; i++) 
            fArray[i] = gArray[i]; 
  
       
        mergeSort3WayRec(fArray, 0, gArray.length, gArray); 
  
       
        for (int i = 0; i < fArray.length; i++) 
            gArray[i] = fArray[i]; 
    } 

    public static void mergeSort3WayRec(int gArray[], 
                  int low, int high,int destArray[]) 
    { 
        
        if (high - low < 2) 
            return; 
  
      
        int mid1 = low + ((high - low) / 3); 
        int mid2 = low + 2 * ((high - low) / 3) + 1; 
  
       
        mergeSort3WayRec(destArray, low, mid1, gArray); 
        mergeSort3WayRec(destArray, mid1, mid2, gArray); 
        mergeSort3WayRec(destArray, mid2, high, gArray); 
  
       
        merge(destArray, low, mid1, mid2, high, gArray); 
    } 
  
   
    public static void merge(int gArray[], int low, 
                           int mid1, int mid2, int high, 
                                   int destArray[]) 
    { 
        int i = low, j = mid1, k = mid2, l = low; 
  
       
        while ((i < mid1) && (j < mid2) && (k < high)) 
        { 
            if (gArray[i]>(gArray[j])) 
            { 
                if (gArray[i]>gArray[k]) 
                    destArray[l++] = gArray[i++]; 
  
                else
                    destArray[l++] = gArray[k++]; 
            } 
            else
            { 
                if (gArray[j]>gArray[k]) 
                    destArray[l++] = gArray[j++]; 
                else
                    destArray[l++] = gArray[k++]; 
            } 
        } 
  
       
        while ((i < mid1) && (j < mid2)) 
        { 
            if (gArray[i]>gArray[j]) 
                destArray[l++] = gArray[i++]; 
            else
                destArray[l++] = gArray[j++]; 
        } 
  
       
        while ((j < mid2) && (k < high)) 
        { 
            if (gArray[j]>gArray[k]) 
                destArray[l++] = gArray[j++]; 
  
            else
                destArray[l++] = gArray[k++]; 
        } 
        while ((i < mid1) && (k < high)) 
        { 
            if (gArray[i]>gArray[k]) 
                destArray[l++] = gArray[i++]; 
            else
                destArray[l++] = gArray[k++]; 
        } 
  
       
        while (i < mid1) 
            destArray[l++] = gArray[i++]; 
  
         
        while (j < mid2) 
            destArray[l++] = gArray[j++]; 
  
  
        while (k < high) 
            destArray[l++] = gArray[k++]; 
    } 
  
  
    public static void main(String args[]) 
    { 
       Scanner x=new Scanner(System.in);
       int n=x.nextInt();
       int data[]=new int[n];
       for(int i=0;i<n;i++)
    	   data[i]=x.nextInt();
  
        mergeSort3Way(data); 
  
        System.out.println("After 3 way merge sort: "); 
        for (int i = 0; i < data.length; i++) 
            System.out.print(data[i] + " "); 
    } 
} 
/*
 
 INPUT-
5
-13
78
4
789
4
OUTPUT-
After 3 way merge sort: 
789 78 4 4 -13 */
