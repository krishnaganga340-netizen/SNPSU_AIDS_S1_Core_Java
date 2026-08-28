package com.snpsu.Strings;

public class BuilderBufferPerformance {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer("SNPSU");
        for(int i=0; i<=100000000; i++){
            sbf.append("Institution");
        }
        System.out.println("Time taken by SBF:" + (System.currentTimeMillis()-startTime)+"ms");

        startTime=System.currentTimeMillis();
        StringBuilder sbl=new StringBuilder("SNPSU");
        for(int i=0; i<=100000000; i++){
            sbl.append("Institution");
        }
        System.out.println("Time taken by SBL:" + (System.currentTimeMillis()-startTime)+"ms");


    }
}

