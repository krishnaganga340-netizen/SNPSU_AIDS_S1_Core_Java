package com.snpsu.basic.oops.pillars.Encapsulation;

public class Employee {
    //attributs
    private String empName;
    private int empId;

    Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }
    //getter
    String getempName(){
        return empName;
    }
    int getempId(){
        return empId;
    }

    void setempName(String empName){
        this.empName=empName;
    }
    void setempId(int empId){
        empId=empId;
    }
    void printDetails() {
        System.out.println("Employee Name:" + this.empName);
        System.out.println("Employee Id:" + this.empId);
    }
}
class DriverCode{
    public static void main(String[] args) {
        Employee emp=new Employee("Ganga", 036);

        System.out.println(emp.getempName());
        System.out.println(emp.getempId());
        emp.setempName("lakshmi");
        emp.printDetails();

    }
}

