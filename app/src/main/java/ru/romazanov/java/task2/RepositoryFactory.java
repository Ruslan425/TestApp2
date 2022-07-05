package ru.romazanov.java.task2;



public class RepositoryFactory {

    public Repository create() {
        return new Repository();
    }

    public static final RepositoryFactory INSTANCE;

    static {
        INSTANCE = new RepositoryFactory();
    }

}
