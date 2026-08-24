package com.snpsu.methods.iteration;

public class Fibonacii {
    public static void main(String[] args) {
        int n = 10;
        int n1 = 0, n2 = 1, Sum = 0;
        System.out.println(n1 + " " + n2 + " ");
        for (int i = 2; i < n; i++) {
            Sum=n1+n2;
            System.out.println(Sum + " ");
            n1=n2;
            n2=Sum;

        }

    }
}
