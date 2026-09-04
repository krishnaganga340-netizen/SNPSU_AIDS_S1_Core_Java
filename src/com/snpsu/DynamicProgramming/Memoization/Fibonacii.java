package com.snpsu.DynamicProgramming.Memoization;

import java.util.Arrays;

public class Fibonacii {
    static int fib(int n,int[] dp){
        if(n==0 || n==1){
            return n;
        }else{
            //check if answer exists
            if(dp[n]!= -1){
                return dp[n];
            }
            //step 2  return first store
            dp[n]= fib(n-1,dp)+fib(n-2,dp);
            return dp[n];
        }

    }

    public static void main(String[] args) {
        int n=1000;
        //step1-create dp array
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        for(int i=0; i<n; i++){
            System.out.println(fib(i,dp));
        }
    }
}



