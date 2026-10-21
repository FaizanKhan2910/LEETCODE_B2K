class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        char[] a = s1.toCharArray();
        Arrays.sort(a);
        String s = new String(a);

        for(int i = 0 ; i <= s2.length() - s1.length(); i++)
        {
            String temp = s2.substring(i , i + s1.length());
            char[] b = temp.toCharArray();

            Arrays.sort(b);

            if(s.equals(new String(b))){
                return true;
            }
        }
        return false;
    }
}