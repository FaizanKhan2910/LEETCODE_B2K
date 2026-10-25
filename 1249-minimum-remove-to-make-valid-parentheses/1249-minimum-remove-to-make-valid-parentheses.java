class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st  = new Stack<>();
        StringBuilder ans = new StringBuilder(s);

        for(int i = 0 ; i < s.length(); i++)
        {
                if(s.charAt(i) == '('){
                    st.push(i);
                }
                else if(s.charAt(i) == ')'){
                    if(st.isEmpty()) ans.setCharAt(i , '*');
                    else st.pop();

                }
            }
            while(!st.isEmpty() ){
                ans.setCharAt(st.pop() , '*');
            }

            return ans.toString().replace("*"  , "");
        }
        
    }
