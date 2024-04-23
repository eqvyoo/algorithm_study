import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(st.nextToken());
            arr[i] = k;
            set.add(k);
        }
        int idx = 0;
        for (int x : set)
            map.put(x, idx++);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(map.get(arr[i]) + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}