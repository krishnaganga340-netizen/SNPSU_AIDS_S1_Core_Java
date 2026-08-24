package com.snpsu.basic.oops.pillars.Inheritance.Hierrachial;

public class Animal {
    void eat(){
        System.out.println("Eating...");
    }
}
//child
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Meow..");
    }
}

    class DriverCode {
        public static void main(String[] args) {
            Animal a = new Animal();
            Dog d = new Dog();
            Cat c = new Cat();

            a.eat();

            d.bark();
            d.eat();
            c.meow();
            c.eat();
        }
    }



