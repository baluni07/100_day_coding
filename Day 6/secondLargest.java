

public class secondLargest {
        public static int print2largest(int[] arr) {
            // Code Here
            if (arr.length <2)
            return -1;
            int s_large=Integer.MIN_VALUE;
            int large= Integer.MIN_VALUE;
            
            for ( int i=0; i<arr.length;i++)
            {
                if(large<arr[i])
                {
                    s_large= large;
                    large= arr[i];
                }
                else if(arr[i]!=large && arr[i]>s_large)
                {
                    s_large= arr[i];
                }
            }
            return (s_large == Integer.MIN_VALUE) ? -1 : s_large;
        }
        public static void main(String[] args) {
            int arr[]= {1,35,23,5,43,23,12};
            System.out.println(print2largest(arr));
        }
    }
    
