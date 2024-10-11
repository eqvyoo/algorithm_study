import java.util.*;

class Solution {
    	static boolean[][] visited;
	
	static int answer = -1;
	
	static int[] mrow = {-1,1,0,0};
	static int[] mcol = {0,0,1,-1};
	
	
	public void bfs(int row, int col, int[][] maps) {
		Queue<Node> q = new LinkedList<>();
		
		q.add(new Node(0,0,1));
		visited[0][0] = true;
		
		while (!q.isEmpty()) {
			Node curr = q.poll();
			
			if (curr.row == maps.length -1 && curr.col == maps[0].length - 1) {
				answer = curr.count;
				return;
			}else {
				for (int i = 0; i < 4; i++) {
					int nextRow = curr.row + mrow[i];
					int nextCol = curr.col + mcol[i];
					
					if (canMove(nextRow, nextCol, maps)) {
						visited[nextRow][nextCol] = true;
						q.add(new Node(nextRow, nextCol, curr.count +1));
					}
				}
				
			}
		}
		
		
		
	}
	
    public int solution(int[][] maps) {
		
    	visited = new boolean[maps.length][maps[0].length];
		bfs(0,0,maps);
		
		return answer;
		
		
		
	}
 
	
	
	class Node{
		int row;
		int col;
		int count;
		
		public Node(int row, int col, int count) {
			this.row = row;
			this.col = col;
			this.count = count;
		}
	}
	
	public boolean canMove(int row, int col, int[][] map) {
		return row >= 0 && row < visited.length && col >= 0 && col < visited[0].length && !visited[row][col] && map[row][col]!= 0;
		
	}
	
}
