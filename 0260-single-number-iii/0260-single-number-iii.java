class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums)
        {
            xor ^= num;
        }

        int rgt = xor & (-xor);

        int grpA = 0;
        int grpB = 0;


        for(int num : nums)
        {
            if((num & rgt) != 0)
            {
                grpA ^= num;
            }else 
            {
                grpB ^= num;
            }
        }


        return new int[]{grpA , grpB};
    }
}