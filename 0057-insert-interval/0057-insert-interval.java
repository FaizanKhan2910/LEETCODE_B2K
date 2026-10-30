class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        

        for(int[] arr : intervals)
        {
           if(arr[1] < start){
            ans.add(arr);
           }else if(arr[0] > end ){
            ans.add(new int[]{start , end});
            start = arr[0];
            end = arr[1];
           }
           else{
            start = Math.min(start , arr[0]);
            end = Math.max(end , arr[1]);
           }
        }
        ans.add(new int[]{start, end});

        return ans.toArray(new int[ans.size()][]);
    }
}