class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int l = 1;
        int h = 0;

        for(int num : quantities)
        {
            h = Math.max(num , h);
        }

        while(l < h){
            int mid = l  + (h - l)/2;
            int sum = 0;

            for(int i = 0 ; i < quantities.length; i++ )
            {
                sum += (quantities[i] + (mid - 1)) / mid;
            }

            if(sum > n)
            {
                l = mid + 1;
            }else
            {
                h = mid;
            }

        }

        return l;
    }
}