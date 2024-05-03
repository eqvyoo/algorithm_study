import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int k = Integer.parseInt(st.nextToken());
                sum += k;
            }
            double avg = (double) sum / 10;
            System.out.println("#"+(i+1)+" "+ Math.round((avg * 10.0) / 10.0));
        }
    }
}