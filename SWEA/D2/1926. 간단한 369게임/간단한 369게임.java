import java.io.*;
import java.util.*;

public class Solution {

    public static String replace(int n){
        String s = "";
        for(int i = 0; i < n; i++){
            s += "-";
        }
        return s;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++){
            String str = String.valueOf(i);
            int cnt = 0;
            for (int j = 0; j < str.length(); j++){
                if ((str.charAt(j) == '3')|| (str.charAt(j) == '6') || (str.charAt(j) == '9'))
                    cnt++;
            }
            if (cnt > 0){
                str = replace(cnt);
            }
            sb.append(str+ " ");
        }
        System.out.println(sb);
    }
}