package ru.romazanov.java.task2.examples.model;

import java.util.ArrayList;

abstract public class Animal {

    public Boolean satiety = false;

    public abstract String run(int length);
    public abstract String swim(int length);
    public abstract void eat(Boolean food);


}


