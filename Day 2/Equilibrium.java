

public class Equilibrium {
    
    static int value ( int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int leftsum=0;
        int rightsum=0;
            for (int j=0;j<i;j++)
            leftsum += arr[j];
            for (int j=i+1;j<n;j++)
            rightsum += arr[j];
            if(leftsum == rightsum)
            {
            return (i+1);
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]= {-7,1,5,2,-4,3,0};
        int n= arr.length;
        System.out.println(value(arr,n));
    }
}
