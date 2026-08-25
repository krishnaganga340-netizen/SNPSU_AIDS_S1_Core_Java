package com.snpsu.Threads.lambda.withLambda;

public interface Greeting {
    void sayHello();
}

class Demo{
    public static void main(String[] args) {
        Greeting g=()-> System.out.println("Hello World");
        g.sayHello();
    }
}
