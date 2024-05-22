import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] p, int[] s) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < p.length; i++){
            int day = (100-p[i]) / s[i];
            if ((100-p[i]) % s[i] != 0){
                day ++;
            }
            queue.offer(day);
            System.out.println(day);
        }
        
        while (!queue.isEmpty()){
            int cnt = 1;
            int deploy = queue.poll();
            while((!queue.isEmpty())&&(queue.peek() <= deploy)){
                cnt++;
                queue.poll();
            }
            answer.add(cnt);
        }
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}