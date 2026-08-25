package com.snpsu.Array.Basics;

public class FindMax {
    public static void main(String[] args) {
        int [] arr={5,7,35,7,2,90,9,53};
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max :" + max);
    }
}
