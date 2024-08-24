import java.util.HashMap;

class NonRpeatingElement
{
  static int  solve (int arr[],int n)
  {
    HashMap <Integer,Integer> mp = new HashMap<>();
    for ( int i = 0; i<n; i++)
    {
        if ( mp.containsKey(arr[i]) )
        mp.put(arr[i], mp.get(arr[i])+1);
        else
        mp.put(arr[i],1);
    }
    for (int i=0; i<n;i++)
    {
    if (mp.get(arr[i])==1)
    return arr[i];
    }
    return -1;
}
    public static void main ( String args[])
    {
        int arr[] = {1,2,1,4,6,4,7,6};
        int n = arr.length;
        System.out.println(solve(arr,n));

    }
}