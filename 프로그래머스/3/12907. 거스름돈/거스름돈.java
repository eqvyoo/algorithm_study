class Solution {
    public int solution(int n, int[] money) {
        int answer = 0;
        
        int[] dp = new int[n+1];
        dp[0] = 1;
        
        for (int e : money){
            for (int i = e; i < n+1; i++){
                if (i >= e)
                    dp[i] += dp[i - e];
            }
        }
        
        
        return dp[n] % 1000000007;
    }
}