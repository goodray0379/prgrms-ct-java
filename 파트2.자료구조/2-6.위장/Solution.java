//2-6.위장
//https://programmers.co.kr/learn/courses/30/lessons/42578
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            if(map.containsKey(clothes[i][1])){
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            }else
                map.put(clothes[i][1], 1);
        }
        for(Integer count : map.values()){
            answer *= (count+1);
        }
        return answer-1;
    }
}