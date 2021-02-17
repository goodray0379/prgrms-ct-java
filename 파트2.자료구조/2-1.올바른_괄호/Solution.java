//2-1.올바른_괄호
//https://programmers.co.kr/learn/courses/30/lessons/12909
import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty()){
                if(c==')') stack.pop();
                else stack.push('(');
            }else{
                if(c==')') return false;
                else stack.push('(');
            }
        }

        return stack.isEmpty();
    }
}