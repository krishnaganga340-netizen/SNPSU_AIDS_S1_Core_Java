package com.snpsu.basic.oops.pillars.Abstaction.PartialAbstraction;

abstract public class RBI {
    RBI(){
        System.out.println("RBI constructor");
    }
    abstract int ROI();

    void welcomeMessage(){
        System.out.println("Welcome");
    }
    static void termsAndConditions(){

        System.out.println("Some Terms and Conditions");
    }



}
 class HDFC extends RBI{
    HDFC(){
        System.out.println("HDFC constructor");
    }

     int ROI(){
        return 6;
    }
     void welcomeMessage(){
         System.out.println("Welcome to HDFC");
     }


}
 class SBI extends RBI{
    SBI(){
        System.out.println("SBI constructor");
    }
     int ROI(){
         return 10;
     }

}
class DriverCode2{
    public static void main(String[] args) {
        HDFC hdfc= new HDFC();
        System.out.println(hdfc.ROI());

       RBI.termsAndConditions();
        SBI sbi= new SBI();
        System.out.println(sbi.ROI());

    }

}