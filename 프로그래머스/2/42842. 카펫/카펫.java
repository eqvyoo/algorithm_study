class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int i = 1; i < brown;i++){
            int width = 2 + (brown/2) - i;
            if (width * i == yellow + brown){
                answer[0] = width;
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}