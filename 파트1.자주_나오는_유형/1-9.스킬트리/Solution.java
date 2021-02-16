//1-9.스킬트리
//https://programmers.co.kr/learn/courses/30/lessons/49993
import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer =0;

        for(int i=0; i<skill_trees.length; i++){
            StringBuffer sb = new StringBuffer();
            for(int j=0; j<skill_trees[i].length(); j++){
                if(skill.contains(skill_trees[i].charAt(j)+""))
                    sb.append(skill_trees[i].charAt(j)+"");
            }

            if(skill.startsWith(sb.toString()))
                answer++;
        }
        return answer;
    }
}