import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sum = 0;
        int time = 0;
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int truck : truck_weights){
            while(true){
                // 다리 위에 아무 트럭도 없을 때
                if (q.isEmpty()){
                    q.add(truck);
                    sum += truck;
                    time++;
                    break;
                // 다리 길이 만큼 트럭이 있을 때
                }else if(q.size() == bridge_length) {
                    sum -= q.poll();
                // 다리 길이 만큼 트럭이 차지 않고 더 올라갈 수 있을 때
                }else if (sum + truck <= weight){
                    q.add(truck);
                    sum += truck;
                    time++;
                    break;
                }else{
                // 더 올라갈 트럭이 없을 때 혹은 다리 길이 만큼 트럭이 찼지만 더 못 올라갈 때 
                    q.add(0);
                    time++;
                }
            }
            
        }
        
        return time + bridge_length;
    }
}