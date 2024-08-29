import java.util.HashMap;
import java.util.Map;

public class frequency {
    static void count(int arr[], int n)
    {
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(arr[i]))
            mp.put(arr[i],mp.get(arr[i])+1);
            else
            mp.put(arr[i],1);
        }
        for(Map.Entry<Integer,Integer>entry:mp.entrySet())
        {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,4,4,5,6,7,2,2,2,2,2,1};
        int n = arr.length;
        count(arr,n);

    }
    
}
