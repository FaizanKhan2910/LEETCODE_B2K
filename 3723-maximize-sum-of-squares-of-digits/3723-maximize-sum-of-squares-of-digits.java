class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if( sum > 9 * num){
            return "";
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < num; i++)
        {
            int digit = Math.min(sum , 9);

            ans = ans.append(digit);

            sum = sum - digit;
        }

        return ans.toString();
    }
}