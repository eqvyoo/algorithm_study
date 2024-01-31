import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int answer;

    private static void dfs(String S,String T){
        StringBuffer sb = new StringBuffer(T);
        if (T.equals(S)){
            answer = 1;
            return;
        }
        if (T.length() == 0){
            return;
        }
        if (T.endsWith("A")){
            T = T.substring(0, T.length()-1);
            dfs(S,T);
        }
        if (T.startsWith("B")){
            T = sb.reverse().toString();
            T = T.substring(0, T.length()-1);
            dfs(S,T);
        }

    }


    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();

        answer = 0;

        dfs(S,T);

        System.out.println(answer);

    }
}