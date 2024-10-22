package com.java.Demos;

public class Person {
    int age = 18;
    String name;

    public void PersonDetails(String Personname){
//        this.age = Personage;
        this.name = Personname;
    }

    public void display(){
        System.out.println("The name of the person is" + " " + name + " " + "and his age is" + " " + age);
    }

    public static void main(String[] args) {
        Person obj = new Person();
        obj.PersonDetails("Sathish");
        obj.display();
    }
}
