import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Stack<int[]> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            if(stack.isEmpty()){
                sb.append( 0 + " ");
            }else{
                while(true){
                    int[] data = stack.peek();
                    int topIdx = data[0];
                    int topHeight = data[1];
                    if(topHeight > n){
                        sb.append(topIdx+" ");
                        break;
                    }else{
                        stack.pop();
                    }
                    if(stack.isEmpty()) {
                        sb.append(0 + " ");
                        break;
                    }
                }
            }
            stack.push(new int[] {i+1, n});
        }
        System.out.println(sb);
    }
}