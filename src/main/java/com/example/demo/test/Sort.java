package com.example.demo.test;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {

        // find default value

       List<Integer> integerList = new ArrayList<>();
        for(int i = 0;i<30;i++){
            Random random = new Random();
            int el = random.nextInt(100);
            integerList.add(el);
        }
        System.out.println(integerList);
        //bubble sort

        for (int i = 0;i < integerList.size()-1;i++){
            int curr = 0;
            int next = integerList.get(i+1);
            if(i>next){
                i = next;
                next = curr;
            }
        }
        System.out.println(integerList);
    }
}
