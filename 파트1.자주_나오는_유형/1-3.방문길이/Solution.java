//1-3 방문길이
//https://programmers.co.kr/learn/courses/30/lessons/49994
import java.util.*;

class Solution {
    public int solution(String dirs) {

        int answer = 0;
        char[] command = dirs.toCharArray();
        Set<String> check = new HashSet<>();
        int x=0; int y=0; int mx=0; int my=0; //기존 x,y좌표와 움직인 후 x,y좌표

        for(int i=0; i<command.length; i++){
            //시뮬레이션 구성
            switch(command[i]){
                case 'U': if(y<5) my++;
                    break;
                case 'D': if(y>-5) my--;
                    break;
                case 'R': if(x<5) mx++;
                    break;
                case 'L': if(x>-5) mx--;
                    break;
            }
            if(x==mx&&y==my)
                continue;
            else{
                //움직인 경로가 처음인지 확인
                if(!check.contains(""+x+y+mx+my)){
                    check.add(""+x+y+mx+my);
                    check.add(""+mx+my+x+y);
                    answer++;
                }
                x = mx; y = my;
            }
        }
        return answer;
    }
}