import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++){

            List<Integer>[] count = new List[26];
            int answer3 = Integer.MAX_VALUE;
            int answer4 = Integer.MIN_VALUE;

            String W = br.readLine();
            int K = Integer.parseInt(br.readLine());
            int wLen = W.length();

            for(int j = 0; j < 26; j++){
                count[j] = new ArrayList<>();
            }

            for (int j = 0; j < wLen ; j++) {
                int start = W.charAt(j) - 'a';
                count[start].add(j);
                if (count[start].size() == K) {
                    int length = j - count[start].get(0) + 1;
                    answer3 = Math.min(answer3, length);
                    answer4 = Math.max(answer4, length);
                    count[start].remove(0);
                }
            }
            if (answer3 == Integer.MAX_VALUE || answer4 == Integer.MIN_VALUE)
                sb.append("-1\n");
            else{
                sb.append(answer3+ " "+answer4+ "\n");
            }
        }
        System.out.println(sb);
    }
}