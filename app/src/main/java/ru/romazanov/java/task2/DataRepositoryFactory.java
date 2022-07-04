package ru.romazanov.java.task2;

public class DataRepositoryFactory {

    public DataRepository getDataRepository() {
        return new DataRepository();
    }

    DataRepository dataRepository = new DataRepository();

}
