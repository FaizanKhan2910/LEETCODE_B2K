class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int MaxSum = nums[0];
        int MinSum = nums[0];

        int currentMax = 0;
        int currentMin = 0;

        for(int num : nums)
        {
            currentMax = Math.max(num , currentMax + num);
            MaxSum = Math.max(MaxSum ,  currentMax);

            currentMin = Math.min(num , currentMin + num);
            MinSum = Math.min(currentMin , MinSum);


            total += num;
        }
        if(MaxSum < 0)
        {
            return MaxSum;
        }

        return Math.max(MaxSum , total - MinSum);
    }
}