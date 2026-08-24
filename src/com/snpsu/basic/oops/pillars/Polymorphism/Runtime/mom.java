package com.snpsu.basic.oops.pillars.Polymorphism.Runtime;

public class mom {
    void  cook(){
        System.out.println("Indian");
    }

}
//override
class Daughter extends mom{
    void cook(){
        System.out.println("Chinese");
    }
}

class DriverCode{
    public static void main(String[] args) {
        mom m=new mom();
        Daughter d=new Daughter();
         m.cook();
         d.cook();
    }
}
