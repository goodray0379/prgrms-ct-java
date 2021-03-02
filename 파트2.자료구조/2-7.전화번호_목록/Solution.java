//2-7.전화번호_목록
//https://programmers.co.kr/learn/courses/30/lessons/42577
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        Arrays.sort(phone_book,
                (o1, o2) -> {return o1.length()-o2.length();});
        for(String number : phone_book){
            for(int i=1; i<=number.length(); i++){
                if(set.contains(number.substring(0, i)))
                    return false;
            }
            set.add(number);
        }
        return true;
    }
}