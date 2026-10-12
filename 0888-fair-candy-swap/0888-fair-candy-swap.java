class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int n1 = aliceSizes.length;
          int n2 = bobSizes.length;
        int[] ans = new int[2];
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n1; i++)
        {
            sum1 += aliceSizes[i];
        }
        for(int i = 0; i < n2 ; i++)
        {
            sum2 += bobSizes[i];
        }

        int diff = (sum1 - sum2) / 2;

         for(int i = 0; i < n1; i++)
        {
                for(int j = 0 ; j < n2 ; j++ )
                {       

                        if(aliceSizes[i] - bobSizes[j] == diff)
                        {
                            ans[0]= aliceSizes[i];
                            ans[1] = bobSizes[j];
                        }



                }
        }


return ans;
        
    }
}