import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char [] sArray = s.toCharArray();
        int acount = 0, answer = s.length(), count = 0;
        for (char c : sArray){
            if (c == 'a')
                acount++;
        }

        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < acount ; j++){
                if(sArray[(i + j) % s.length()] == 'b')
                    count++;
            }
            answer = Math.min(answer, count);
            count = 0;
        }
        System.out.println(answer);
    }
}