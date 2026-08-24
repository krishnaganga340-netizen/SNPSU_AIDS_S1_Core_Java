package com.snpsu.basic.oops.pillars.Inheritance.SuperKeyword;

public class Person {
    String Fname;
    String Lname;

    Person(String Fname, String Lname){
     this.Fname=Fname;
     this.Lname=Lname;

}
}
class Student extends Person{
    int rollNo;



    Student(String Fname, String Lname, int rollNo){
        super(Fname,Lname);
        this.rollNo=rollNo;

    }
}
class DriverCode{
    public static void main(String[] args) {
        Person p1=new Person("ganga","lakshmi");
        Student s1=new Student("ganga","lakshmi",036);
        System.out.println(p1.Fname);
        System.out.println(p1.Lname);
        System.out.println(s1.rollNo);
        System.out.println(s1.Fname);
        System.out.println(s1.Lname);
    }
}