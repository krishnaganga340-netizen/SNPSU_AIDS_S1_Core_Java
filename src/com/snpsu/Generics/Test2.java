package com.snpsu.Generics;

public class Test2<k,v> {
    k key;
    v val;

    Test2(k key,v val){
        this.key=key;
        this.val=val;
    }

}
class Driver2{
    public static void main(String[] args) {
        Test2<String,Integer> obj1=new Test2<>("Ganga",63);
        System.out.println(obj1.key);
        System.out.println(obj1.val);
    }
}
