import java.util.*;

class Solution {
    public int solution(String dirs) {
        
        int answer = 0;
        char[] command = dirs.toCharArray();
        Set<String> check = new HashSet<>();
        int x=0; int y=0; int mx=0; int my=0; //���� x,y��ǥ�� ������ �� x,y��ǥ
        
        for(int i=0; i<command.length; i++){
            //�ùķ��̼� ����
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
                //������ ��ΰ� ó������ Ȯ��
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