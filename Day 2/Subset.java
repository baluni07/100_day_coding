

public class Subset {
    static boolean isSub(int arr1[], int arr2[])
    {

        int n= arr1.length;
        int m = arr2.length;
        for(int i=0 ; i < m; i++)
        {
            boolean found = false;
            for ( int j=0;j<n;j++)
            {
                 found = false;
                if ( arr2[i]==arr1[j])
                {
                found= true;
                break;
                }
            }
            if (!found)
            return false;
          
        }
        return true;

    } 
    public static void main(String[] args) {
        int arr1[]= {1,2,45,6,7,11,14};
        int arr2 []= {1,11,14,5};
        System.out.println(isSub(arr1,arr2));
    }
}
