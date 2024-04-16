import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static class Member implements Comparable<Member>{
        int age;
        String name;
        int idx;

        Member(int age, String name, int idx){
            this.age = age;
            this.name = name;
            this.idx = idx;
        }
        @Override
        public int compareTo (Member o){
            if (this.age != o.age)
                return this.age - o.age;
            return this.idx - o.idx;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Member[] members = new Member[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            int idx = i;
            members[i] = new Member(age, name, idx);
        }

        Arrays.sort(members);

        for (Member m : members)
            System.out.println(m.age + " "+ m.name);
    }
}