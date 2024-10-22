package com.java.Demos;
class BaseParent{
    String name;
    int age;

    public BaseParent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends BaseParent{
    long EmployeeId;
    long salary;

    public Employee(String name, int age, long EmployeeId, long salary ) {
        super(name, age);
        this.EmployeeId = EmployeeId;
        this.salary = salary;
    }

    public void display(){
        System.out.println("The name of the person is" + " " + name);
        System.out.println("Age of the person is" + " " + age);
        System.out.println("The employeeid of the person is" + " " + EmployeeId);
        System.out.println("The salary of the person is" + " " + salary);
    }


}

public class NewPerson {
    public static void main(String[] args) {
//        System.out.println("Hey");
        Employee E1 = new Employee("Sathish", 25, 12345, 10000);
        E1.display();

    }
}
