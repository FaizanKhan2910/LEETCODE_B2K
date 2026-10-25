class Solution {
    public boolean wordPattern(String pattern, String s) {
Map map = new HashMap<>();
      String[] str = s.split(" ");
      if(pattern.length() != str.length){
        return false;
      }

      for(Integer i = 0 ; i < str.length; ++i)
      {
        if(map.put(pattern.charAt(i) , i) != map.put(str[i] , i )){
        
                return false;
            }
         
      }  
      return true;
    }
}
