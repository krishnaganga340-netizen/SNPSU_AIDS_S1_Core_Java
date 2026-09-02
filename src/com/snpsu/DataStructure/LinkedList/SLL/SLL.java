package com.snpsu.DataStructure.LinkedList.SLL;

class Node{
   int data;
   Node next;//pointing towords node object

    //constructor
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SLL {
       Node head;
       SLL(){
           this.head=null;

        }
        void insertAthead(int val){
           Node n=new Node(val);
           n.next=head;
           head=n;

        }

        void insertAtTail(int val){
           Node n=new Node(val);
           if(head==null){
               head=n;
               return;
           }
           Node temp=head;
           while(temp.next!=null){
               temp=temp.next;

           }
              temp.next=n;

        }


    int getLLSize(){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp= temp.next;
            size++;
        }
        return size;
    }

    void insertAtPos(int val, int pos){
        Node n = new Node(val);
        int size = getLLSize();
        if(pos < 0 || pos > size){
            System.out.println("Get Lost");
        }else if(pos == 0){
            n.next = head;
            head = n;
        }else{
            Node temp = head;
            while(--pos > 0){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }

        void deleteAtHead(){
           if(head==null){
               System.out.println("Linked list is empty");
               return;
           }
           Node todelete=head;
           head=head.next;
           todelete=null;// call garbage collection (it will delete but stored in memory
        }
         void deleteByValue(int val){
           if(head==null){
               System.out.println("LinkedList is empty");
               return;
           }
           Node temp=head;
           while(temp.next!=null && temp.next.data!=val){
               temp=temp.next;
           }
           if(temp.next==null){
               System.out.println("value not found");
               return;
           }
           if(head.data==val){
               deleteAtHead();
               return;
           }
           Node todelete=temp.next;
           temp.next=temp.next.next;
           todelete=null;
         }

        void printSLL(){
           Node temp=head;
           while(temp!=null) {
               System.out.print(temp.data+" ");
               temp = temp.next;
           }
            System.out.println("null");

        }
    }
    class Driver{
        public static void main(String[] args) {
            SLL  sll=new SLL();
            sll.insertAthead(10);
            sll.insertAthead(20);
            sll.insertAthead(30);
            sll.printSLL();
            sll.insertAthead(40);
            sll.printSLL();
            sll.insertAtTail(50);
            sll.printSLL();
            sll.insertAtPos(60,3);
            sll.printSLL();
            sll.deleteByValue(10);
            sll.printSLL();
        }
}