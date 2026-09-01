package com.snpsu.DataStructure.Stack;

public class Stack {
    int[] arr;
    int top;
    int size;

    Stack(int size){
        this.size=size;
        top=-1;
        arr=new int[size];
    }
    void push(int val){
        if(top==size-1){
            System.out.println("OverFlow");
            return;
        }
        top++;
        arr[top]=val;
    }
    void pop(){
        if(top==-1){
            System.out.println("underflow");
            return;
        }
        arr[top]=0;
        top--;
    }
    int top(){
        if(top==-1){
            System.out.println("underflow");
            return  -1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;

        }
    }


class Driver{
    public static void main(String[] args) {
        Stack st=new Stack(5);
        st.push(12);
        st.push(14);
        st.push(15);
        st.push(16);
        st.push(17);
        System.out.println(st.top());
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.top());


    }

}
