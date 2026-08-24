package com.snpsu.basic.oops.withAttributes;

public class Car {
    String Brand;//attributes(instance variable)
    int manuDate;//attributes(instance variable)

    Car(String Brand, int manuDate){//parameters of the constructors
         this.Brand=Brand;//this is keyword
         this.manuDate=manuDate;


     }
     //creating methods
     void printDetails(){
         System.out.println("Car Brand:" +Brand);
         System.out.println("Car menuDate:" + manuDate);
     }

    public static void main(String[] args) {
        //creating objects

         Car c1=new Car("BMW", 2000);
         Car  c2=new Car("Audi",2010);
         c1.printDetails();
         c2.printDetails();
    }
}
