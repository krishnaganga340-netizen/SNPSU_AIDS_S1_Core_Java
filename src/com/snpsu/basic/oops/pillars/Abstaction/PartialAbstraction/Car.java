package com.snpsu.basic.oops.pillars.Abstaction.PartialAbstraction;

abstract class Car {
abstract void start();
    void brake(){
        System.out.println("Car Stops");
    }
}
class BMW extends Car{
    void start(){
        System.out.println("BMW starts with a butto ");
    }
}
class Toyota extends Car{
    void start(){
        System.out.println("Tayota starts with a key");
    }
}

class DRiverCode {
    public static void main(String[] args) {
    }
}