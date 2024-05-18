import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T;tc++) {
            int N = Integer.parseInt(br.readLine());

                System.out.println("#"+ tc + " " + N*N);
        }
    }
}