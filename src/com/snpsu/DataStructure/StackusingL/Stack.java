package com.snpsu.DataStructure.StackusingL;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class Stack {
        Node top;//top points to the top of the node

        Stack() {
            top = null;
        }

        void push(int val) {
            Node n = new Node(val);

            n.next = top;
            top = n;
        }

       void pop(){
            if(top==null){
                System.out.println("Underflow");
                return;
            }
            top=top.next;
       }

        int top() {   // this method return the value of the top
            if (top == null) {
                System.out.println("Underflow");
                return -1;
            }

            return top.data;
        }

        boolean isEmpty() {
            return top == null;
        }
    }

    class Driver {
        public static void main(String[] args) {

            Stack st = new Stack();

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