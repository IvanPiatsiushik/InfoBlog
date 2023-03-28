package com.example.demo.test;

public class TestRecurcion {
    public static int show(int number){
        int result = 1;
        if (number==0||number==1){
            return result;
        }
        result = number*show(number-1);
        return result;

//        for (int i= 1;i<=number;i++){
//            result = result*i;
//        }
//        return result;
    }
    public static void main(String[] args) {

        System.out.println(show(0));
        System.out.println(show(1));
        System.out.println(show(3));
    }
}
