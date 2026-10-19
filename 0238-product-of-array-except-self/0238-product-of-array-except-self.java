class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
    
       
        // for(int i = 0 ; i < n ; i++ )
        // {
           
        //      int sum = 1;
        //     for(int j = 0 ; j < i; j++)
        //     {
        //         sum *= nums[j];
        //     }
        //       for(int k = i + 1 ; k < n ; k++)
        //     {
        //         sum *= nums[k];
        //     }

        //     ans[i] = sum;
        // }. // ab ye to brute force hain isme 19 / 24 pass hue hain ab kuch aur karo
        ans[0] = 1;
        for(int i = 1 ; i < n ; i++)
        {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
    int suffix = 1;
        for(int i = n - 1; i >= 0; i-- )
        {
            ans[i] = ans[i] * suffix;
            suffix = suffix * nums[i];
        }

        return ans;
    }
}