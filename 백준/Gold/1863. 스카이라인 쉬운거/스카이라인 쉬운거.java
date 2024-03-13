import java.util.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 스카이라인 쉬운거

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<N; i++)
        {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty() && stack.peek() > y)
            {
                answer++;
                stack.pop();
            }
            //같은 높이 == 같은 빌딩 -> stack에 넣을 필요가 없음
            if(!stack.isEmpty() && stack.peek() == y)
            {
                continue;
            }
            //높이가 높아짐 -> stack에 push해서 최고층 높이의 건물을 갱신
            stack.push(y);
        }

        while (!stack.isEmpty())
        {
            //남은 건물이 있음 -> answer를 ++ 해주고, pop 진행
            if(stack.peek() > 0)
                answer++;
            stack.pop();
        }
        System.out.println(answer);
    }
}