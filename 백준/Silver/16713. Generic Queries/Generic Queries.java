import java.io.*;
import java.util.*;
// 백준#16713
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int[] seq = new int[n];
        int[] xor = new int[n+1];
        int ans = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++){
            xor[i] = xor[i-1] ^ seq[i-1];
        }

        for (int i = 0; i < q; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            ans ^= xor[a] ^ xor[s-1];
        }
        System.out.println(ans);

    }
}