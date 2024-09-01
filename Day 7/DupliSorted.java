public class DupliSorted {
        public static int remove(int[] nums) {
            int i=0;
            for(int j=1;j<nums.length;j++)
            {
                if (nums[i]!=nums[j])
                {
                    i++;
                    nums[i]=nums[j];
                }
            }
            return i+1;
        }
        public static void main(String[] args) {
            int nums[]= {2,4,4,5,6,7,9,9};
            System.out.println(remove(nums));
        }
    }
