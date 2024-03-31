class Solution {
    public int solution(int n) {
        int answer = 0;
        // int[] arr = new int[17];
        int startIdx = 0;
        for (int i = 17; i >= 0 ; i--){
            if ((n / Math.pow(3,i)) >= 1){
                startIdx = i;
                break;
            } 
        }
        
        int[] arr = new int[startIdx+1];
        
        for (int i = 0; i <= startIdx; i++){
            arr[i] = (int) (n / Math.pow(3,startIdx - i));
            n = n - (int) (arr[i] * Math.pow(3,startIdx - i));
        }
        
        for (int i = 0; i <= startIdx; i++){
            answer += (int) arr[i] * Math.pow(3, i); 
        }
        
        return answer;
    }
}