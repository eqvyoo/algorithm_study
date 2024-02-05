import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main{

    static class Info{

        public int dist;

        public int idx;

        public Info(int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }

        public Info(){}
    }

    static class Edge{
        public int weight;

        public int to;

        public Edge(int to, int weight){
            this.weight = weight;
            this.to = to;
        }
    }

    static int [] dist;
    static int N, M, start, end;

    static ArrayList<Edge>[] edges;

    static void dijkstra (int start){
        // 1. 모든 정점까지에 대한 거리를 무한대로 초기화
        for (int i = 1; i <= N; i++)
            dist[i] = Integer.MAX_VALUE;


        // 2. 최소 힙 생성
        PriorityQueue<Info> pq = new PriorityQueue<Info>(Comparator.comparingInt(o-> o.dist));

        // 3. 시작점에 대한 정보를 기록에 추가, dist 배열 갱신
        pq.add(new Info(start, 0));
        dist[start] = 0;
        //4. 거리 정보들이 모두 소진될 때 까지 거리 갱신 반복

        while (!pq.isEmpty()){
            Info info = pq.poll();
            if(dist[info.idx] < info.dist)
                continue;
            for (Edge e: edges[info.idx]){
                if (dist[info.idx] + e.weight >= dist[e.to])
                    continue;
                dist[e.to] = dist[info.idx] + e.weight;
                pq.add (new Info (e.to, dist[e.to]));
            }

        }

    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        dist = new int[N+1];
        edges = new ArrayList[N+1];
        for(int i = 1; i <= N; i++){
            edges[i] = new ArrayList<Edge>();
        }
        for (int i = 1; i <= M; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            edges[from].add(new Edge(to, weight));
        }

        st = new StringTokenizer(br.readLine());

        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        dijkstra(start);
        System.out.println(dist[end]);

    }

}
