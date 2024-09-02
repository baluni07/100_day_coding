public class Maxproduct {
        public static int maxProduct(int[] nums) {
            int prefix=1;
            int suffix=1;
            int maxi=0;
            for ( int i=0;i<nums.length;i++)
            {
                if(prefix==0) prefix=0;
                if(suffix==0) suffix=0;
                prefix= prefix*nums[i];
                suffix= suffix*nums[i];
                maxi= Math.max(maxi, Math.max(prefix,suffix));
             }
             return maxi;
        }
    public static void main(String[] args) {
        int nums[]= {1,-3,2,4,-1,3,-4};
        System.out.println(maxProduct(nums));
    }
    }
