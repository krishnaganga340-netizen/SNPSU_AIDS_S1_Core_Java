package com.snpsu.methods.iteration;

public class SumOfN {
    public static void main(String[] args) {
        int num = 5;
        int Sum = 0;
        for (int i = 0; i <= num; i++) {
            Sum += i;
        }
        System.out.println(Sum);
    }
}