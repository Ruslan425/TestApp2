package ru.romazanov.java.task2.examples.model;

public class Cat extends Animal {


    @Override
    public String run(int length) {
        if (length <= 200) {
            return "Кот пробежал " + length + "м.";
        } else {
            return "Кот не может столько пробежать";
        }
    }

    @Override
    public String swim(int length) {
        return "Кот не умеет плавать";
    }

    @Override
    public void eat(Boolean food) {
        satiety = food;
    }

}
