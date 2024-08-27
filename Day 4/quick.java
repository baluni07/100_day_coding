public class quick 
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high)
        {
            int j= partition(arr,low,high);
            quickSort( arr,low,j-1);
            quickSort(arr,j+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int i=low;
        int j=high;
        int pivot=arr[low];
        
        while(i<j)
        {
              while (i<high && arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            
            if(i<j)
            {
            int t=arr[i];
            arr[i]= arr[j];
            arr[j]= t;
            
            }
        }
        int t=arr[j];
            arr[j]= arr[low];
            arr[low]= t;
            return j;
    } 
    public static void main(String[] args) {
        int arr[]= {1,2,6,0,3,7,4};
        int n= arr.length;
        quickSort( arr,0,n-1);
        for ( int i=0;i<n;i++)
        {
          System.out.print(arr[i]);

        }
        System.out.println();
    }
}
