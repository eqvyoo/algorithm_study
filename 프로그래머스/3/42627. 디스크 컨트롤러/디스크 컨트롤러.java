import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        
        Arrays.sort(jobs, (a,b) -> a[0]-b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1] - b[1]);
        
        int cnt = 0;
        int total = 0;
        int idx = 0;
        int end = 0;
        
        while (cnt < jobs.length){
            while(idx < jobs.length && jobs[idx][0] <= end){
                pq.add(jobs[idx++]);
            }
            if (pq.isEmpty()) {
                end = jobs[idx][0];
            }else{
                int[] curr = pq.poll();
                total += end + curr[1] - curr[0];
                end += curr[1];
                cnt++;
            }
        }
        return total/jobs.length;
    }
}