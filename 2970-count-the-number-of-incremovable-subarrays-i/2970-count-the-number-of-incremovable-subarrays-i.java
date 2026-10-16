class Solution {
    public int incremovableSubarrayCount(int[] nums) {
   
        int n = nums.length ;
        int count= 0;
        for(int i = 0 ; i < n; i++)
        {
            for(int j = i ; j < n; j++)
            {
                boolean valid = true; ;
                int prev = -1;

                for(int k = 0 ; k < n ; k++)
                {
                        if( k >= i && k <= j)
                        {
                            continue;
                            //karo isko aage badhne do kyuki sahi ja raha hain
                        }

                        if(nums[k] <= prev)
                        {
                            valid = false;
                            break;
                        }
                        prev = nums[k];
                       
                }
                 if(valid)
                        {
                            count++;
                        }
            }
        }

        return count ;
    }
}