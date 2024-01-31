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
        if (T.length() == S.length()){
            return;
        }
        if (T.endsWith("A")){
            dfs(S,T.substring(0, T.length()-1));
        }
        if (T.startsWith("B")){
            T = sb.reverse().toString();
            dfs(S,T.substring(0, T.length()-1));
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