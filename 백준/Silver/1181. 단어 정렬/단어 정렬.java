import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] st = new String[n];

        for (int i = 0; i < n; i++) {
            st[i] = br.readLine();
        }
        Arrays.sort(st, (o1, o2) -> {
            if (o1.length() == o2.length())
                return o1.compareTo(o2);
            return o1.length() - o2.length();
        });
        String[] distArr = Arrays.stream(st).distinct().toArray(String[]::new);
        for (String s : distArr) {
            System.out.println(s);
        }

    }
}