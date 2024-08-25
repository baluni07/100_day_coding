public class SortColors {
    public static void sortColors(int[] nums) {
        int n= nums.length;
        int low =0,mid=0,high=n-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int t = nums[mid];
                nums[mid]=nums[low];
                nums[low]=t;
                mid++;
                low++;
            }
            else if(nums[mid]==1)
            mid++;
           else {
                int t= nums[mid];
                nums[mid]=nums[high];
                nums[high]=t;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[]= {1,1,0,0,2,1,0,2};
        int n= nums.length;
        sortColors( nums);
        for ( int i=0;i<n;i++)
        {
          System.out.print(nums[i]);

        }
        System.out.println();
    }
}

    

