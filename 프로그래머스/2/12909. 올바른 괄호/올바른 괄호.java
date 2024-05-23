import java.util.*;
import java.io.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                stack.push('(');
            else if((!stack.empty())&&(s.charAt(i) == ')')&& (stack.peek() == '('))
                stack.pop();
            else
                return false;
        }
        if (stack.empty())
            return true;
        else
            return false;
        
    }
}