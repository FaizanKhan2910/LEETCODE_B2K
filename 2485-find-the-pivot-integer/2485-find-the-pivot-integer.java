class Solution {
    public int pivotInteger(int n) {
      
        if( n == 1 )
        {
            return 1;
        }
       

        for(int i = 1 ; i <=  n ; i++)
        {
              int sum = 0;
        int revSum = 0;

          for(int j = 1  ; j <= i; j++)
            {
                 sum += j;
            }
           

            for(int j = n ; j >= i; j--)
            {
                revSum += j;
            }

            if(revSum == sum){
                return i;
            }
        }
return -1;
    }
}