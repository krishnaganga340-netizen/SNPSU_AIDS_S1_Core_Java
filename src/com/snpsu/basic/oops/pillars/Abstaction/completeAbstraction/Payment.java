package com.snpsu.basic.oops.pillars.Abstaction.completeAbstraction;

public interface Payment {
    void pay();

    default  void refund(){

        System.out.println("Refund");
    }

}
class UPI implements Payment{
    public void pay(){
        System.out.println("Paying through the UPI");
    }
}
class CreditCard implements Payment{
    public void pay(){
        System.out.println("Paying through the CreditCard");
    }
    public void refund(){
        System.out.println("Refund");
    }
}
class Cash implements Payment{
    public void pay(){
        System.out.println("Paying through the Cash");
    }
}
class Drivercode3{
    public static void main(String[] args) {
        Payment p=new UPI();
        p.pay();
    }

}