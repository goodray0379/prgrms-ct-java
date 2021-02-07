//1-5 소수만들기
//https://programmers.co.kr/learn/courses/30/lessons/12977

import java.lang.Math;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(isPrime( sum ))
                        answer++;
                }
            }
        }
        return answer;
    }

    public boolean isPrime(int number){
        //Math.sqrt(n) => n의 제곱근
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}