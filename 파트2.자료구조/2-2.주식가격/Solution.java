//2-2.주식가격
//https://programmers.co.kr/learn/courses/30/lessons/42584
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[i]>prices[j]){
                    answer[i] = j-i;
                    break;
                }

                if(j==prices.length-1) answer[i] = j-i;
            }
        }
        return answer;
    }
}