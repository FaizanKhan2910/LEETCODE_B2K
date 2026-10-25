class Solution {
    public boolean wordPattern(String pattern, String s) {

      String[] str = s.split(" ");
      if(pattern.length() != str.length){
        return false;
      }

      for(int i = 0 ; i < pattern.length() - 1; i++)
      {
         for(int j = i + 1 ; j < pattern.length(); j++)
         {
            if(pattern.charAt(i) == pattern.charAt(j)
            && !str[i].equals(str[j])){
                return false;
            }

             if(pattern.charAt(i) != pattern.charAt(j)
            && str[i].equals(str[j])){
                return false;
            }
         }
      }  
      return true;
    }
}