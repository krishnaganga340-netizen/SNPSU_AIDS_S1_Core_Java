package com.snpsu.DataStructure.LinkedList.DLL;



class Node{

    int data;
    Node pre;
    Node Next;
    Node(int data){
        this.data=data;
        this.pre=null;
        this.Next=null;
    }

}



public class DLL {
    Node head;

    DLL() {
        this.head = null;//default constructor
    }


    void InsertAtHead(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = n;
            return;
        }
        n.Next = head;//forword connection
        head.pre = n;//backword connection
        head = n;

    }
    void InsertAtTail(int val){
        Node n=new Node(val);
        if(head==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.Next!=null){
            temp=temp.Next;

        }
        temp.Next=n;
        n.pre=temp;
    }
//    void InsertAtPos(int val, int pos){
//       Node n = new  Node(val);
//        Node temp=head;
//        while(--pos>0){
//            temp=temp.Next;
//        }
//        n.Next=temp.Next;
//        n.pre=temp;
//        temp.Next.pre=n;
//        temp.Next=n;
//
//
//
  //  }
int getLLSize() {
    int size = 0;
    Node temp = head;

    while (temp != null) {
        temp = temp.Next;
        size++;
    }

    return size;
}

    void insertAtPos(int val, int pos) {
        Node n = new Node(val);

        int size = getLLSize(); // calling to find how many nodes currently in the list

        if (pos < 0 || pos > size) {
            System.out.println("Get Lost");
        }
        else if (pos == 0) {
            if (head == null) {
                head = n;
            }
            else {
                n.Next = head;
                head.pre = n;
                head = n;
            }
        }
        else {
            Node temp = head;

            while (--pos > 0) {
                temp = temp.Next;
            }

            n.Next = temp.Next;
            n.pre = temp;

            if (temp.Next != null) {
                temp.Next.pre = n;
            }

            temp.Next = n;
        }
    }
    void  deleteAThead(){
        if(head==null){
            return;
        }
        Node toDelete=head;
        head=head.Next;
        if(head!=null){
            head.pre=null;
        }
        toDelete=null;
    }
    void deleteByValue(int val){
        if(head==null){
            return;
        }
        if(head.data==val){
            Node todelete=head;
            head=head.Next;

            if(head!=null){
                head.pre=null;
            }
            return;
        }
        Node todelete=null;

        Node temp=head;
        while(temp!=null && temp.Next.data!=val){
            temp=temp.Next;
        }
        if(temp!=null){
            temp.pre.Next=temp.Next;
            if(temp.Next!=null){
                temp.Next.pre=temp.pre;
            }
        }


    }


    void printDLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.Next;
        }
        System.out.println("null");
    }
}

class Driver{
    public static void main(String[] args) {
        DLL dll=new DLL();
        dll.InsertAtHead(10);
        dll.InsertAtHead(20);
        dll.InsertAtHead(30);
        dll.printDLL();
        dll.InsertAtHead(50);
        dll.printDLL();
        dll.InsertAtTail(60);
        dll.printDLL();
        dll.insertAtPos(25,3);
        dll.printDLL();
        dll.deleteAThead();
        dll.printDLL();
        dll.deleteByValue(30);
        dll.printDLL();
    }
}



