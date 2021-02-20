// 2-3. 기능개발
// https://programmers.co.kr/learn/courses/30/lessons/42586
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;    //총 끝낸 작업
        int count = 0;  //당일 끝낸 작업
        int idx = 0;    //현재까지 끝낸 작업 index
        while(sum<progresses.length){
            for(int i=0; i<progresses.length; i++){
                if(progresses[i]<100) progresses[i] += speeds[i];
            }

            count = 0;
            for(int i=idx; i<progresses.length; i++){
                if(progresses[i]>=100) count++;
                else{
                    idx = i;
                    break;
                }
            }
            if(count>0){
                queue.add(count);
                sum += count;
            }
        }

        int[] answer = new int[queue.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = queue.poll();

        return answer;
    }
}