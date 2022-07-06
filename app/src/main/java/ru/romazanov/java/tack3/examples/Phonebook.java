package ru.romazanov.java.tack3.examples;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Phonebook {

    HashMap<String, ArrayList<Integer>> phonebookHasMap = new HashMap<>();


    void add(String name, Integer number) {
        if (phonebookHasMap.containsKey(name)) {
            ArrayList<Integer> addNumber = phonebookHasMap.get(name);
            addNumber.add(number);
            phonebookHasMap.replace(name, addNumber);
        } else {
            ArrayList<Integer> addNumber = new ArrayList<>();
            addNumber.add(number);
            phonebookHasMap.put(name, addNumber);
        }
    }


    void get(String name) {

        System.out.println("Номера по фамилий: " + name);
        if (phonebookHasMap.containsKey(name)) {
            for (Integer number : phonebookHasMap.get(name)) {
                System.out.println(number);
            }
        } else {
            System.out.println("Такой записи нет");
        }
    }


    // Для тестов.
    public void addNew(Scanner in) {

        System.out.print("Input a name: ");
        String name = in.nextLine();
        System.out.print("Input a number: ");
        int number = in.nextInt();
        add(name, number);

    }

    public void getNew(Scanner in) {
        System.out.println("Input name: ");
        String name = in.nextLine();
        get(name);
    }

}
