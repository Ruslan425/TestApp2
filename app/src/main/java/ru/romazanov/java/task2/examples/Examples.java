package ru.romazanov.java.task2.examples;

public class Examples {

    public static void main(String[] args) throws MyException {

        Vaz vazObject = new Vaz();
        vazObject.name = "";

        Vag vagObject = new Vag();
        vazObject.fuel();

        ExceptionExample exceptionExample = new ExceptionExample();

        int age = exceptionExample.example("fdf"); // Ошибка и вернет 0

        int age2 = exceptionExample.example("2"); // Вернет 2

        int age3 = exceptionExample.example("-2");  // Ошибка

    }
}

// Пример инкапсуляций
class Encapsulation {
    private String name;
    private int age;

    public void setName(String newName) {
        if (newName.length() > 1) name = newName;
    }

    public void setAge(int newAge) {
        if (newAge > 0) age = newAge;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

// Наследование и полиморфизм. Абстракция сюда тоже подходит :)
abstract class Auto {
    String engine;
    String name;
    String color;

    public void fuel() {
    }
}

// Класссы наследники имеют те же поля что и родитель
class Vaz extends Auto {
    void speed() {
        System.out.println("Макс скорость 100");
    }

    @Override
    public void fuel() {
        System.out.println("Еду на бензине");
    }
}

class Vag extends Auto {
    void speed() {
        System.out.println("Макс скорость 150");
    }

    @Override
    public void fuel() {
        System.out.println("Еду на дизеле");
    }
}


// Ошибки и обработка
class MyException extends Exception {
    public MyException(String s) {
        System.out.println(s);
    }
}

class ExceptionExample {

    public int example(String age) throws MyException {

        int newAge;

        try {
            newAge = Integer.getInteger(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            newAge = 0;
        } finally {
            System.out.println("Возвраст получен нужный или 0");
        }

        if (newAge < 0) {
            throw new MyException("Возраст не может быть меньше 0");
        }
        return newAge;
    }

}







