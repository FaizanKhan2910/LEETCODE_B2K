class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans = new ArrayList<>();
            int a = firstList.length;
            int b = secondList.length;
        int i = 0 , j = 0;

        while(i < a && j < b ){
        
        int st = Math.max(firstList[i][0] , secondList[j][0]  );
        int end = Math.min( firstList[i][1], secondList[j][1] );
                if(st <= end) {
                    ans.add(new int[]{st , end});
                }

            if(firstList[i][1] < secondList[j][1]){
                i++;
            }else{
                j++; 
            }

        }
       
    return ans.toArray(new int[ans.size()][]);
        
    }
}