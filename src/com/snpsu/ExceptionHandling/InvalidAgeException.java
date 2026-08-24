package com.snpsu.ExceptionHandling;

public class InvalidAgeException extends Exception{
    //constructor
    InvalidAgeException(String msg){
        super(msg);
    }
}
class Driver{
    public static void main(String[] args) throws Exception {
        int age=10;
        if(age<18){
            throw  new InvalidAgeException("Age must be over 18!");
        }
        System.out.println("you can vote!");
    }
}
     