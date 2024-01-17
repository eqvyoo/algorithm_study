import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[][] d = new int [10001][4];

        d[1][1] = 1;
        d[2][1] = 1;
        d[3][1] = 1;
        d[2][2] = 1;
        d[3][2] = 1;
        d[3][3] = 1;

        for (int i = 4; i <= 10000; i++) {
            d[i][1] = d[i - 1][1];

            d[i][2] = d[i - 2][1] + d[i - 2][2];

            d[i][3] = d[i - 3][1] + d[i - 3][2] + d[i - 3][3];
        }

        for (int i = 0; i < tc; i++){
            int num = sc.nextInt();

            System.out.println(d[num][1] + d[num][2] + d[num][3]);
        }
    }
}