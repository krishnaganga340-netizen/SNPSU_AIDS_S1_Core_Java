package com.snpsu.basic.oops.pillars.Polymorphism.compileTime;

public class Addition {
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b, int c){
        return a+b+c;
    }
    float add(int a,float b,int c){
        return a+b+c;
    }
}
class DriverCode {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println(obj.add(2, 9));
        System.out.println(obj.add(2, 5, 7));
        System.out.println(obj.add(4, 7,9));
    }
}
