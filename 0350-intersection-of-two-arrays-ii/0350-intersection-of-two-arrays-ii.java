class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] ans  = new int[Math.max(nums1.length , nums2.length)];
        HashMap<Integer , Integer> map = new HashMap<>();
        int index = 0;
        for(int i = 0 ; i < nums1.length; i++)
        {
            map.put(nums1[i] , map.getOrDefault(nums1[i] , 0) + 1);
        }
             for(int i = 0 ; i < nums2.length; i++)
        {
           if(map.getOrDefault(nums2[i] , 0) > 0){
                ans[index] = nums2[i];
                index++;
                map.put(nums2[i] , map.get(nums2[i]) - 1 ); 
           }
        }

        
        
return Arrays.copyOf(ans , index);
    }
}