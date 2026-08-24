package com.snpsu.basic.oops.pillars.Inheritance.multilevel;

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
class puppy extends Dog{
    void crying(){


        System.out.println("Crying...");
    }
}

class DriverCode{
    public static void main(String[] args) {
        Animal a=new Animal();
        Dog d=new Dog();
        puppy p=new puppy();



        a.eat();

        d.bark();
        d.eat();

        p.crying();
        p.bark();
        p.eat();

    }
}



