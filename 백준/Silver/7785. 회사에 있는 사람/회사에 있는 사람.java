import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String name;
        Set<String> list = new HashSet<>();



        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            String action = st.nextToken();
            if (action.equals("enter")) {
                list.add(name);
            } else
                list.remove(name);
        }
        List<String> answer = new ArrayList<>(list);

        Collections.sort(answer);
        Collections.reverse(answer);

        for (String user : answer){
            System.out.println(user);
        }
    }
}
