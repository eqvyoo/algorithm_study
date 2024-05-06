import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long tc = Long.parseLong(br.readLine());
        for (int j = 0; j < tc; j++) {
            int n = Integer.parseInt(br.readLine());
            long [] list = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++){
                long k = Long.parseLong(st.nextToken());
                list[i] = k;
            }
            long maxPrice = 0;
            long [] temp = new long [n];
            long result = 0;
            for (int i = n-1; i >= 0; i--) {
                if (maxPrice < list[i])
                    maxPrice = list[i];
                temp[i] = maxPrice - list[i];
            }
            for (int i = 0; i < n; i++){
                result += temp[i];
            }
            System.out.println("#"+ (j + 1)+ " "+ result);
        }
    }
}