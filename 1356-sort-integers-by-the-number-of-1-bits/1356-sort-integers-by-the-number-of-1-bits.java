class Solution {
    public int[] sortByBits(int[] arr) {

    Integer[] nums = new Integer[arr.length];

      for(int i = 0 ; i< arr.length; i++)
      {
            nums[i] = arr[i];
      }
      Arrays.sort(nums, (a , b) ->{
       int CountA = Integer.bitCount(a);
       int  CountB = Integer.bitCount(b);

        if(CountA != CountB){
            return CountA - CountB;
        }

        return a - b;
      }
      );

       for(int i = 0 ; i< arr.length; i++)
      {
             arr[i]= nums[i] ;
      }

      return arr;
    }
}