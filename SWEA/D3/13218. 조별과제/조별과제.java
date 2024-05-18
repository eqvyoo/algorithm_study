import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T;tc++) {
            int n = Integer.parseInt(br.readLine());
            int ans = n/3;

            System.out.println("#"+ tc + " " + ans);
        }
    }
}