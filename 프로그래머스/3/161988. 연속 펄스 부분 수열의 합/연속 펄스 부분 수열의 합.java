class Solution {
    
    public long solution(int[] sequence) {
        
        for(int i = 0; i < sequence.length; i++){
            if (i % 2 == 1)
                sequence[i] = sequence[i] * (-1);
        }
        
        int currMax = -100000;
        int globalMax = -100000;
        
        for(int i = 0; i < sequence.length; i++){
            if (i % 2 == 1){
                currMax = Math.max(e, currMax + e);
                globalMax = Math.max(currMax, globalMax);
            }else{
                currMax = Math.max(e, currMax + e);
                globalMax = Math.max(currMax, globalMax);
            }
            
        }
        
        return globalMax;
    }
        
}