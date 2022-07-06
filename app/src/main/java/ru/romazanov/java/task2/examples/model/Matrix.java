package ru.romazanov.java.task2.examples.model;


import java.util.ArrayList;

import ru.romazanov.java.task2.examples.model.exception.MyArrayDataException;
import ru.romazanov.java.task2.examples.model.exception.MyArraySizeException;


public class Matrix {


    public ArrayList<ArrayList<Integer>> newArray = new ArrayList<>();


    public ArrayList<Integer> getArray(String line) throws MyArrayDataException {
        ArrayList<Integer> intList = new ArrayList<>();

        for (String s : line.split(" ")) {
            try {
                intList.add(Integer.parseInt(s));
            } catch (NumberFormatException ignored) {
                int errorLine = newArray.size() + 1;
                int errorElement = intList.size() + 1;
                throw new MyArrayDataException("Ошибка ввода " + errorLine + " строке " + errorElement + " Элемент");
            }
        }
        return intList;
    }

    public void addToMatrix(ArrayList<Integer> list) throws MyArraySizeException {

        if (list.size() != 4) {
            throw new MyArraySizeException("Не верное количчество символов");
        } else {
            newArray.add(list);
        }
    }

    public int getSum() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int num : newArray.get(i)) {
                sum += num;
            }
        }
        return sum;
    }

    public void clearArray() {
        newArray = new ArrayList<>();
    }

}



