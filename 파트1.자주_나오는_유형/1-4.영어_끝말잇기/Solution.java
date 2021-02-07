//1-4 영어 끝말잇기
//https://programmers.co.kr/learn/courses/30/lessons/12981

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        Set<String> set = new HashSet<String>(); //중복 단어 검색용
        set.add(words[0]);

        for(int i=1; i<words.length; i++){
            //중복단어 || 앞단어의 끝문자와 현재단어의 앞문자 비교
            if( !set.add(words[i]) || //중복된 값은 add()가 false를 반환
                    words[i-1].charAt( words[i-1].length()-1 ) != words[i].charAt(0) ){
                answer[0] = i%n + 1;
                answer[1] = i/n + 1;
                break;
            }
        }

        return answer;
    }
}