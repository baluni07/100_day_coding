

public class MoveZero {
        public static void moveZeroes(int[] nums, int n) {
            int j=0;
            
            for ( int i=0;i<n;i++)
            {
                if(nums[i]==0){
                j=i;
                break;
                }
            }
         
            for(int i=j+1;i<n;i++)
                if(nums[j]==0 && nums[i]!=0)
                {
                    int t= nums[i];
                    nums[i]= nums[j];
                    nums[j]=t;
                    j++;
                }
            }
            public static void main(String[] args) {
                int nums[]= {1,2,0,0,3,7,0};
                int n= nums.length;
                moveZeroes( nums,n);
                for ( int i=0;i<n;i++)
                {
                  System.out.print(nums[i]);

                }
                System.out.println();
            }
        }
