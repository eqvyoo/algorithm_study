import java.util.*;
import java.io.*;

class Solution {
    public int solution(int N, int number) {
        if (N == number)
            return 1;
        
        List<Set<Integer>> dp = new ArrayList<>();
        for (int i = 0; i <= 8; i++){
            dp.add(new HashSet<>());
        }
        dp.get(1).add(N);
        
        for(int i = 2; i <= 8; i++){
            Set<Integer> cntSet = dp.get(i);
            
            for (int j = 1; j <= i; j++){
                Set<Integer>preSet = dp.get(j);
                Set<Integer>postSet = dp.get(i-j);
                
                for ( int n : preSet){
                    for (int m : postSet){
                        cntSet.add(n + m);
                        cntSet.add(n - m);
                        cntSet.add(n * m);
                        
                        if (n != 0 && m != 0)
                            cntSet.add(n/m);
                    }
                }
            }
            cntSet.add(Integer.parseInt(String.valueOf(N).repeat(i)));
        }
        
        for (Set<Integer> sub : dp){
            if (sub.contains(number))
                return dp.indexOf(sub);
        }
        return -1;
    }
}