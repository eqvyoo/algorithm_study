import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int k = Integer.parseInt(st.nextToken());
                if (k % 2 == 1)
                    sum += k;
            }
            System.out.println("#" + (i+1) + " "+ sum);
        }
    }
}