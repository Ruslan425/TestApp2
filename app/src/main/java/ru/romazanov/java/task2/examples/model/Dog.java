package ru.romazanov.java.task2.examples.model;

public class Dog extends Animal {

    @Override
    public String run(int length) {
        if (length <= 500) {
            return "Собака пробежала " + length + "м.";
        } else {
            return "Собака не может столько пробежать";
        }
    }

    @Override
    public String swim(int length) {
        if (length <= 10) {
            return "Собака проплыла " + length + "м.";
        } else {
            return "Собака не может столько проплыть";
        }
    }

    @Override
    public void eat(Boolean food) {
        satiety = food;
    }



}
