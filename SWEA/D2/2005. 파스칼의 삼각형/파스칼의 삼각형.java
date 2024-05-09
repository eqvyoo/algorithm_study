import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int j = 1; j <= tc; j++) {
            int n = Integer.parseInt(br.readLine());
            int[][] pascal = new int[n][];
            for (int i = 0; i < n; i++) {
                pascal[i] = new int[i + 1];
                pascal[i][0] = 1;
                pascal[i][i] = 1;
                for (int k = 1; k < i; k++) {
                    pascal[i][k] = pascal[i - 1][k - 1] + pascal[i - 1][k];
                }
            }
            System.out.println("#" + j);

            for (int i = 0; i < pascal.length; i++) {
                for (int k = 0; k < pascal[i].length; k++) {
                    System.out.print(pascal[i][k] + " ");
                }
                System.out.println();
            }
        }
    }
}