import java.util.*;
import java.io.*;

public class Main {

    static boolean isPossible(int[] heights, int cutHeight, int threshold){
        long sum = 0;

        for (int h : heights){
            if (h > cutHeight)
                sum += h - cutHeight;
        }
        return sum >= threshold;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] heights = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < heights.length; i++){
            heights[i] = Integer.parseInt(st.nextToken());
        }

        int l = 0, r = 1000000000, ans = -1;

        while (l <= r){
            int middle = (l + r) / 2;
            if (isPossible(heights, middle, m)){
                ans = middle;
                l = middle + 1;
            }
            else
                r = middle -1;
        }
        System.out.println(ans);
    }
}
