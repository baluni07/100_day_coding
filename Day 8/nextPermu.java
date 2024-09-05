
public class nextPermu {
    public static void nextPermutation(int[] nums) {
        int n= nums.length;
        int i= n-2;
        int last= n-1;
        while(i>=0 && nums[i]>=nums[i+1])
            i--;

        if(i>=0)
        {
        int j=n-1;
        while(nums[i]>=nums[j])
        j--;
        swap(nums,i,j);
        }

        reverse(nums,i+1,last);
    }
    static void swap(int nums[], int i, int j)
    {
        int t=nums[j];
        nums[j]= nums[i];
        nums[i]=t;
    }
    static void reverse(int nums[],int start,int end)
    {
        if(start<end)
        {
        swap(nums,start,end);
        start++;
        end--;        } 

        }
        public static void main(String[] args) {
            int nums[]= {1,2,3};
            nextPermutation(nums);
            System.out.println(nums);
        }
    
}
