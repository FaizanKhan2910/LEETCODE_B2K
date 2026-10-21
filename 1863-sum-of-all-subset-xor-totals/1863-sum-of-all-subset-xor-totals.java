class Solution {
    public int subsetXORSum(int[] nums) {
       
            int n = nums.length;

            int result = 0;

            for(int num : nums)

            {
                result = result | num;
            }

            result = result << (n-1);


         return result;   
    }
}