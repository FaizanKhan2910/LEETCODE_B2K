class Solution {
    public int[] constructRectangle(int area) {

        int length = 0;
          
            int width = (int) Math.sqrt(area);

            while( area % width != 0 )
            {
                width = width - 1;
              
                   
            
            }
            length = area / width;
            

            return new int[]{length , width};



    }
}