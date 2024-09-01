
import java.util.*;
public class DupliUnsorted {
    static void duplicate(int arr[], int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!mp.containsKey(arr[i])) {
                System.out.print(arr[i] + " ");
                mp.put(arr[i], 1);
            }
        }
    }

    public static void main(String[] args) {
        int n = 9;
        int arr[] = { 4, 3, 9, 2, 4, 1, 10, 3, 3,4 };

        duplicate(arr, n);
    }
}

    
