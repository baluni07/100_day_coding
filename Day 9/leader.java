import java.util.*;
class leader{
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> ans= new ArrayList<>();
        int maxi= Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>maxi)
            {
             maxi= arr[i];
             ans.add(0,arr[i]);
            }
            
        }
        
        return ans;
    }
}
