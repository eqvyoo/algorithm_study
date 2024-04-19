import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] list = new String[n];
        Map<String, Integer> map = new TreeMap<>();
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String st = br.readLine();
            list[i] = st;
        }

        Arrays.sort(list);

        for (int i = 0; i < n; i++) {
            if (map.containsKey(list[i])) {
                int val = map.get(list[i]);
                map.put(list[i], val + 1);
            } else {
                map.put(list[i], 1);
            }
        }

        for (String i : map.keySet()) {
            if (map.get(i) > maxVal) {
                maxVal = map.get(i);
            }
        }
        for (String i : map.keySet()) {
            if (map.get(i) == maxVal) {
                System.out.println(i);
                break;
            }
        }
    }
}