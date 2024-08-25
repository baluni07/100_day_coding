public class twoSum {
        public static int[] Sum(int[] nums, int target) {
            int n= nums.length;
            int left=0;
            int right=n-1;
            while(left<right)
            {
            int sum= nums[right]+ nums[left];
            if(sum==target)
            return new int[]{left,right};
            else if(sum<target)
            left++;
            else
            right--;
        }
         return new int[]{};
    }
    public static void main(String[] args) {
        int nums[]= {1,3,4,5,7,4,5,2};
        
        int target= 10;
        System.out.println(Sum(nums,target));
    }
  }
