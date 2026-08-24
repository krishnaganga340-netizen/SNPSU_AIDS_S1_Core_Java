package com.snpsu.basic.oops.withoutAttributes;

public class Hello {
  static  void printHello() {
        System.out.println("Hello");
    }

    class DriverCode {
        public static void main(String[] args) {
            Hello obj = new Hello();
            obj.printHello();
        }
    }
}