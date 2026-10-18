class Solution {
    public int minOperations(int[] nums, int k) {
        int ans  = 0;
        for(int num : nums)
        {
            ans = ans ^ num; 
        }

        int differeve = (ans) ^ k;

        int solved = Integer.bitCount(differeve);


        return solved;
    }
}