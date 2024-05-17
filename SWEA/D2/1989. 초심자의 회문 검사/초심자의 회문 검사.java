import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T;tc++){
            String st = br.readLine();
            boolean flag = true;
            for(int i = 0; i < st.length(); i++){
                if(st.charAt(i) != st.charAt(st.length()-i-1)){
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.println("#" + tc + " " + 1);
            else{
                System.out.println("#" + tc + " " + 0);
            }
        }
    }
}