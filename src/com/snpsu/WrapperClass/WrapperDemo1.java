package com.snpsu.WrapperClass;

public class WrapperDemo1 {
    public static void main(String[] args) {
        int x = 10;
        Integer obj=new Integer(x);//manual creating

        System.out.println("Primitive Val:" +x);
        System.out.println("Object Val:" + x);
    }
}
