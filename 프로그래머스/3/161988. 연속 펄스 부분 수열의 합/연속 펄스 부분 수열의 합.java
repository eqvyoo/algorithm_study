class Solution {
    
    public long solution(int[] sequence) {
        long answer = Long.MIN_VALUE;
        
        long[] minusDP = new long[sequence.length];
        long[] plusDP = new long[sequence.length];
        
        int minus = -1;
        int plus = 1;
        
       
        
        for (int i = 0; i < sequence.length; i++){
            if(i == 0){
                minusDP[i] = sequence[0] * minus ;
                plusDP[i] = sequence[0] * plus;
            } else{
            minusDP[i] = Math.max(minusDP[i-1] + sequence[i] * minus,sequence[i] * minus);
            plusDP[i] = Math.max(plusDP[i-1] + sequence[i] * plus, sequence[i] * plus);
            }
            
            minus *= -1;
            plus *= -1;
            answer = Math.max(plusDP[i], Math.max(answer, minusDP[i]));
        }
        return answer;
    }
}
