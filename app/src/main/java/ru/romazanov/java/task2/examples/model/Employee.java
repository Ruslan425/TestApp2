package ru.romazanov.java.task2.examples.model;

public class Employee {

    public String name = "Undefined";
    public String age = "Undefined";
    public String jobTitle = "Undefined";
    public String email = "Undefined";
    public String phoneNumber = "Undefined";
    public String pay = "Undefined";

    public Employee(
            String n,
            String a,
            String j,
            String e,
            String p,
            String m
    ) {
        name = n;
        age = a;
        jobTitle = j;
        email = e;
        phoneNumber = p;
        pay = m;
    }

    public Employee() {

    }

}



