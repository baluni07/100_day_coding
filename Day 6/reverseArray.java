
public class reverseArray {
    static void reverseArr(int arr[],int start,int end)
    {
        if(start<end)
        {
            int t = arr[start];
            arr[start]= arr[end];
            arr[end]= t;
            
            reverseArr( arr, start+1, end-1);
        }
        
    }
        public static void main(String[] args) {
            int arr[]= {1,3,4,5,7,9,15,21};
            int n= arr.length;
            reverseArr(arr,0, n-1);
            for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }
    
}

