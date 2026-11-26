class Solution {
    public boolean canAliceWin(int n) {
       int take = 10;
       int step = 0;



       while(n  >= take){
          n = n - take;
          take--;
          step++;
       }
      
       return step % 2 != 0;

    }
}