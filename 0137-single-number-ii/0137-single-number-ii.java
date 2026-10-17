class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int k = 0 ; k <= 31 ; k++){
              int temp = (1 << k);
            int countOfOne = 0 , countOfZero = 0;

            for(int num : nums){
              

                if( (temp & num) == 0){
                    countOfZero++; 
                }
                else {
                    countOfOne++;
                }

            }
            if(countOfOne % 3 == 1){
                result = result | (temp); 
            }
        }

        return result;
 
    }
}