class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length ;
        int b = nums2.length ;
        int[] ans = new int[a + b];
        int k = 0 , i = 0 , j = 0;
        while( i < a && j < b){
            if(nums1[i] < nums2[j]){
                ans[k] = nums1[i];
                i++;
                k++;
            }else{
                ans[k] = nums2[j];
                j++;
                k++;
            }
        } while(i < a){
            ans[k] = nums1[i];
            i++;
            k++;
        }  while(j < b){
            ans[k] = nums2[j];
            j++;
            k++;
        }
        int med = ans.length;
         if(med % 2 == 0){
               return ((double ) ans[med/2 - 1] + ans[med/2] )/ 2.0 ;
            }else{
                return ans[med / 2];
            }

    }
}