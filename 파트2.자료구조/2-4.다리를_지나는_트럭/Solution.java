//2-4.다리를_지나는_트럭
//https://programmers.co.kr/learn/courses/30/lessons/42583
import java.util.*;
class Truck {
    public int time;
    public int weight;

    Truck(int time, int weigth){
        this.time = time;
        this.weight = weigth;
    }
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> wait = new LinkedList<>();
        Queue<Truck> ing = new LinkedList<>();

        for(int i=0; i<truck_weights.length; i++)
            wait.offer(truck_weights[i]);

        int time = 0;
        int sum = 0;
        while(!wait.isEmpty()||!ing.isEmpty()){

            time++;
            if(!ing.isEmpty()){
                if(time - ing.peek().time == bridge_length)
                    sum -= ing.poll().weight;

            }

            if(!wait.isEmpty()){
                if(weight>=sum+wait.peek()){
                    sum += wait.peek();
                    ing.offer(new Truck(time, wait.poll()));
                }
            }
        }

        return time;
    }
}