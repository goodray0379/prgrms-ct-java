//1-6 다음 큰 숫자
//https://programmers.co.kr/learn/courses/30/lessons/12911


class Solution {
    public int solution(int n) {
        int count = getCount(n);
        while(true){
            n++;
            if(getCount(n)==count)
                break;
        }
        return n;
    }

    public int getCount(int n){
        String binary = Integer.toBinaryString(n);
        int count =0;
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i)=='1')
                count++;
        }
        return count;
    }
}