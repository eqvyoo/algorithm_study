class Solution {
    
    public void dfs(int node, boolean[] visited, int[][] computers){
        visited[node] = true;
        
        for (int i = 0; i < computers.length; i++){
            if (visited[i] == false && computers[node][i] == 1)
                dfs(i,visited, computers);
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int len = computers.length;
        boolean[] visited = new boolean[len];
        
        for (int i = 0; i < len; i++){
            if(visited[i] == false){
                answer++;
                dfs(i,visited, computers);
            }
        }
        return answer;
    }
}