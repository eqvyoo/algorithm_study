import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T;tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int U = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            if (X > U)
                System.out.println("#"+ tc + " -1");
            else if ((X<=U) && (X>=L)) {
                System.out.println("#"+ tc + " 0");

            } else
                System.out.println("#"+ tc + " " + (L-X));
        }
    }
}