///1-8.문자열_내_마음대로_정렬하기
//https://programmers.co.kr/learn/courses/30/lessons/12915
import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) ->{
            if(o1.charAt(n)>o2.charAt(n))
                return 1;
            else if(o1.charAt(n)==o2.charAt(n))
                return o1.compareTo(o2);
            else
                return -1;
        });
        return strings;
    }
}