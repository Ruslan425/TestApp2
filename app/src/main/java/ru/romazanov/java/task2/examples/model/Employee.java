package ru.romazanov.java.task2.examples.model;

public class Employee {

    public String name = "Undefined";
    public String age = "Undefined";
    public String jobTitle = "Undefined";
    public String email = "Undefined";
    public String phoneNumber = "Undefined";
    public String pay = "Undefined";

    public Employee(
            String name,
            String age,
            String jodTitle,
            String email,
            String phoneNumber,
            String pay
    ) {
        this.name = name;
        this.age = age;
        this.jobTitle = jodTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pay = pay;
    }

    public Employee() {

    }

}



