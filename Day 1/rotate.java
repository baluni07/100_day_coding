class rotate{
    
    static void rotateArr(int arr[], int d, int n) {
        // add your code here
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 5, 3, 5, 3, 2, 1};
        int d = 2;
        int n = arr.length;
        rotateArr(arr, d, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
