import java.io.*;
import java.util.*;

public class Main{
	
	static int answer;
	static int n;
	static String[] tokens;
	
	private static int calculator (int a, String b, int c) {
		if (b.equals("-")) {
			return a - c;
		}else if (b.equals("+")) {
			return a + c;
		}else
			return a * c;
	}
	
	private static void solve (int i, int sum) {
		if (i >= n) {
			answer = Math.max(answer, sum);
			return;
			
		}
		solve (i + 2, calculator(sum, tokens[i-1],Integer.parseInt(tokens[i])));
		
		//오른 괄호
		if (i + 2 < n) {
			int right = calculator(Integer.parseInt(tokens[i]), tokens[i+1], Integer.parseInt(tokens[i+2]));
			int left = calculator(sum, tokens[i-1], right);
			solve(i+4, left);
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		String equation = br.readLine();
		tokens = equation.split("(?=[-+*])|(?<=[-+*])");
		answer = Integer.MIN_VALUE;
		solve(2, Integer.parseInt(tokens[0]));
		System.out.println(answer);
		
		
	}
}