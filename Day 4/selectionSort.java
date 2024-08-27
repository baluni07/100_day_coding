public class selectionSort {
    
    public static void Sort(int arr[],int n)
    {
        
        for(int i=0;i<n;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if (arr[min]>arr[j])
                min=j;
            }
            int t= arr[min];
            arr[min]=arr[i];
            arr[i]=t;
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,6,0,3,7,4};
        int n= arr.length;
        Sort( arr,n);
        for ( int i=0;i<n;i++)
        {
          System.out.print(arr[i]);

        }
        System.out.println();
    }
}


