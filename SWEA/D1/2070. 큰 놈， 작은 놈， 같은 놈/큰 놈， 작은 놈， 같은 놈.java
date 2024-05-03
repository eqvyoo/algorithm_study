import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a > b)
                System.out.println("#"+(i+1)+" >" );
            else if (a == b)
                System.out.println("#"+(i+1)+" =" );
            else
                System.out.println("#"+(i+1)+" <" );
        }
    }
}