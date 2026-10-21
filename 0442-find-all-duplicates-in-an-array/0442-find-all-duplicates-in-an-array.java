class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
         List<Integer> ans =  new ArrayList<Integer>();

         for(int num : nums)

         {
            if(set.contains(num)){
                ans.add(num);
            }
            set.add(num);
         }

         return ans;
    }
}