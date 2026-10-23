class Solution {
    public int subarraysDivByK(int[] nums, int k) {
   HashMap<Integer , Integer> map = new HashMap<>();

   map.put(0 , 1);
        int count = 0;

    
              int sum = 0;
            for(int num : nums)
            {
                sum += num;

                int rem = ((sum % k) + k ) % k; // bhai ye line -ve  nahianedegi 
                //kyuki +k hokar +ve baenga and then answer tumhra rem vahi rahega

                if(map.containsKey(rem))
                {
                    count += map.get(rem);
                }

                map.put(rem , map.getOrDefault(rem , 0) + 1);
            }
        

        return count;

    }
}