package ru.romazanov.java.task2;

import java.util.ArrayList;


import ru.romazanov.java.task2.examples.model.Matrix;
import ru.romazanov.java.task2.examples.model.Cat;
import ru.romazanov.java.task2.examples.model.Dog;
import ru.romazanov.java.task2.examples.model.Employee;
import ru.romazanov.java.task2.examples.model.Plate;

public class DataRepository {

    public ArrayList<Employee> employeeArrayList = new ArrayList();
    public Employee getEmploy(
            String n,
            String a,
            String j,
            String e,
            String p,
            String m
    ) {
        return new Employee(n, a, j, e, p, m);
    }
    public void addToList(Employee employee) {
        employeeArrayList.add(employee);
    }


    public ArrayList<Dog> dogList = new ArrayList();
    public Dog getDog() {
        return new Dog();
    }


    public ArrayList<Cat> catList = new ArrayList();
    public Cat getCat() {
        return new Cat();
    }

    public Plate plate = new Plate();

    public Matrix matrix = new Matrix();

}
