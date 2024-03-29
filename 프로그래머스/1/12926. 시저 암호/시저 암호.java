class Solution {
    public String solution(String s, int n) {
        String ans = "";
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            // 소문자일 때
            if (Character.isLowerCase(c))
                c = (char) ('a' + (c + n - 'a')%26) ;
            
            //대문자일 때
            else if (Character.isUpperCase(c))
                c = (char) ('A' + (c + n - 'A')%26) ;
            
            ans += c;
        }
        return ans;
    }
}