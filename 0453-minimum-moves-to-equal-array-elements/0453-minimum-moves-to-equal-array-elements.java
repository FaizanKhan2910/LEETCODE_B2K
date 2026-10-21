class Solution {
    public int minMoves(int[] nums) {
        int[] ans = new int[nums.length];
        int decSum = 0;
 int min = nums[0];

        for(int i = 1 ; i  < nums.length; i++)
        {
                min = Math.min(nums[i]  , min);
        }

          for(int i = 0 ; i  < nums.length; i++)
        {
             ans[i] = nums[i] - min;
        }

        for(int i = 0 ; i < ans.length; i++)
        {
            decSum += ans[i];
        }

      
     
        return decSum;
    }
}