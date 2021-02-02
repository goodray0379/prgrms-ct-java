//1-2.모의고사
//https://programmers.co.kr/learn/courses/30/lessons/42840
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int patterns[][] = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        List<Integer> highestPersonList = new ArrayList<>();

        int max = 0;
        int count;
        for(int i=0; i<patterns.length; i++){
            count = 0;
            int length = patterns[i].length;
            for(int j=0; j<answers.length; j++){
                if(patterns[i][j%length]==answers[j])
                    count++;
            }
            if(count>max){
                highestPersonList.clear();
                highestPersonList.add(i+1);
                max = count;
            }else if(count==max){
                highestPersonList.add(i+1);
            }
        }

        int[] highestPersonArr = new int[highestPersonList.size()];
        for(int i=0; i<highestPersonArr.length; i++)
            highestPersonArr[i] = highestPersonList.get(i);

        return highestPersonArr;
    }
}