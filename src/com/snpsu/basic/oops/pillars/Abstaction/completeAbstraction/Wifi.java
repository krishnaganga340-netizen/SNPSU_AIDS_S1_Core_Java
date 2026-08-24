package com.snpsu.basic.oops.pillars.Abstaction.completeAbstraction;

public interface Wifi {
    void connect();//abstract


}
class Laptop implements Wifi{
   public  void connect(){
        System.out.println("Laptop connected to Wifi");
    }

}
class phone implements Wifi {
    public void connect() {
        System.out.println("Phone connected to Wifi");
    }
}
class DriverCode{
    public static void main(String[] args) {
        Laptop L1=new Laptop();
        phone P1 = new phone();
        P1.connect();
        L1.connect();
    }
}