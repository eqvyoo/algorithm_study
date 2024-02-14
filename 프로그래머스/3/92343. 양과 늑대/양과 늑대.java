import java.util.*;

class Solution {
    
    private static int answer;
    private static final List<List<Integer>> Graph = new LinkedList<>();
    
    private void dfs(int[] info, List<Integer>list, int node, int sheep, int wolf){
        if (info[node] == 0)
            sheep++;
        else
            wolf += 1;
        if (sheep <= wolf)
            return;
        answer = Math.max(answer, sheep);
        
        List<Integer> next = new ArrayList<>(list);
        if(!Graph.get(node).isEmpty()){
            next.addAll(Graph.get(node));
        }
        next.remove(Integer.valueOf(node));
        
        for(int i : next)
            dfs(info,next,i,sheep,wolf);
    }
    
    public int solution(int[] info, int[][] edges) {
        answer = 0;
        
        for(int i = 0; i < info.length; i++){
            Graph.add(new LinkedList<>());
        }
        for (int[] e : edges){
            Graph.get(e[0]).add(e[1]);
        }
        final List<Integer> next = new LinkedList<>();
        next.add(0);
        
        dfs(info, next, 0,0,0);
        
        
        
        return answer;
    }
}
