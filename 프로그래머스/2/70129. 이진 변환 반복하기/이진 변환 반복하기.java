class Solution {
    static int zeroCount;
    static int cnt;
    
    static private String f(String s){
        int zero = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1')
                sb.append("1");
            else
                zero++;
        }
        cnt++;
        zeroCount += zero;
        return Integer.toBinaryString(s.length() - zero);
    }
    
    
    public int[] solution(String s) {
        zeroCount = 0;
        cnt = 0;
        
        while (!s.equals("1")){
            s = f(s);
        }
        
        int[] answer = {cnt,zeroCount};
        return answer;
    }
}