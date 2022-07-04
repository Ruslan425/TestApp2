package ru.romazanov.java.task2.examples.model;

public class Plate {

    public int food;

    public Boolean getFood(int eat) {
        if (food - eat >= 0) {
            food -= eat;
            return true;
        } else {
            return false;
        }
    }

    public void setFood(int food) {
        this.food += food;
    }

}
