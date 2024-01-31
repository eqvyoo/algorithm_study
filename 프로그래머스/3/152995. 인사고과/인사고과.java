class Solution {
    
    private boolean isHigher(int[] arr, int[][] scores){
        for (int[] e : scores){
            if(arr[0] < e[0] && arr[1] < e[1])
                return false;
        }
        return true;
    }
    public int solution(int[][] scores) {
        int answer = 1;

        for (int[] e : scores){
            if ((e[0] + e[1] > scores[0][0] + scores[0][1])&& isHigher(e,scores))
                answer += 1;
        }
        
        for (int[] e : scores){
            if (e[0] > scores[0][0] && e[1] >scores[0][1])
                answer = -1;
        }
        
        return answer;
    }
}