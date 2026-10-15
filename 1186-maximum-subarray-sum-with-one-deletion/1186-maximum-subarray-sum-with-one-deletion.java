class Solution {
    public int maximumSum(int[] arr) {
        int noDelete = arr[0];
        int oneDelete = 0;
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            int OldNoDelete = noDelete;
            oneDelete = Math.max( OldNoDelete , oneDelete + arr[i] );

            noDelete = Math.max( arr[i] , OldNoDelete + arr[i] );

            ans = Math.max(ans , Math.max(noDelete , oneDelete));
        }

        return ans;
    }
}