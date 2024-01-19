import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int[] DP = new int[10001];
        int[][] shortcut = new int[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            shortcut[i][0] = Integer.parseInt(st.nextToken());
            shortcut[i][1] = Integer.parseInt(st.nextToken());
            shortcut[i][2] = Integer.parseInt(st.nextToken());
        }
        Arrays.fill(DP, Integer.MAX_VALUE);
        DP[0] = 0;

        for (int i = 1; i < DP.length; i++) {
            for (int j = 0; j < shortcut.length; j++) {
                if (i == shortcut[j][1]) {
                    DP[i] = Math.min(DP[i],
                            Math.min(DP[i - 1] + 1, DP[shortcut[j][0]] + shortcut[j][2])
                    );
                } else {
                    DP[i] = Math.min(DP[i], DP[i - 1] + 1);
                }
            }
        }
        System.out.println(DP[D]);
    }
}