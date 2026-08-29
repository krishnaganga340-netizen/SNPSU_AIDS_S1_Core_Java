package com.snpsu.Generics;

import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
       // list.add("ganga");//compile time error
        list.add(10);
        System.out.println(list);
    }

}
