package com.snpsu.ExceptionHandling;

public class E3 {
    public static void main(String[] args) {
        int age=15;
        if (age>=18){
            System.out.println("Eligible -Access to voting granted!");
        }
        else{
            throw new RuntimeException("Not Eligible-access denied!");
        }
    }
}
