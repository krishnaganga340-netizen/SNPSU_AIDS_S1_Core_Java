package com.snpsu.methods;

public class Recursion {
    static void function(int n){
        if(n==100){
            return;
        }

        System.out.println(n);
        function(n+1);
    }

    public static void main(String[] args) {
        function(10);
    }
}
