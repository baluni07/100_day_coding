
public class bubble {
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i=0;i<n-1;i++)
        {
            for (int j= 1;j<n-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int t = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,6,0,3,7,4};
        int n= arr.length;
        bubbleSort( arr,n);
        for ( int i=0;i<n;i++)
        {
          System.out.print(arr[i]);

        }
        System.out.println();
    }
}

