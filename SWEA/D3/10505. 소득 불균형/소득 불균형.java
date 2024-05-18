import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T;tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] list = new int[N];
            int sum = 0;
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++){
                int k = Integer.parseInt(st.nextToken());
                list[i] = k;
                sum += k;
            }
            double avg = (double) sum / N;
            for (int i = 0; i < N; i++){
                if(list[i] <= avg){
                    cnt++;
                }
            }
                System.out.println("#"+ tc + " "+ cnt);
        }
    }
}