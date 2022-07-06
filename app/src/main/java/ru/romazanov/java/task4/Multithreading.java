package ru.romazanov.java.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;


public class Multithreading {

    public void getArray10() {
        float[] array10 = new float[10000];
        Arrays.fill(array10, 1);
        for (int i = 0; i < array10.length; i++) {
            array10[i] = (float) (array10[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5)
                    * Math.cos(0.4f + i / 2));
        }
    }

    public void getArray100() {
        float[] array100 = new float[100000];
        Arrays.fill(array100, 1);
        for (int i = 0; i < array100.length; i++) {
            array100[i] = (float) (array100[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5)
                    * Math.cos(0.4f + i / 2));
        }
    }

    public void getArray1000() {
        float[] array1000 = new float[1000000];
        Arrays.fill(array1000, 1);
        for (int i = 0; i < array1000.length; i++) {
            array1000[i] = (float) (array1000[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5)
                    * Math.cos(0.4f + i / 2));
        }
    }

    public ArrayList<String> getMultithreading() {

        AtomicReference<String> one = new AtomicReference<>("");
        AtomicReference<String> two = new AtomicReference<>("");
        AtomicReference<String> three = new AtomicReference<>("");

        Runnable test1 = () -> {
            long time = System.currentTimeMillis();
            try {
                getArray10();
            } catch (InternalError error) {
                System.out.println(error.getMessage());
            }
            one.set("Первый поток: " + (System.currentTimeMillis() - time));
        };
        Runnable test2 = () -> {
            long time = System.currentTimeMillis();
            try {
                getArray100();
            } catch (InternalError error) {
                System.out.println(error.getMessage());
            }
            two.set("Второй поток: " + (System.currentTimeMillis() - time));
        };
        Runnable test3 = () -> {
            long time = System.currentTimeMillis();
            try {
                getArray1000();
            } catch (InternalError error) {
                System.out.println(error.getMessage());
            }
            three.set("Третий поток: " + (System.currentTimeMillis() - time));
        };

        Thread myThread1 = new Thread(test1, "myThread1");
        Thread myThread2 = new Thread(test2, "myThread2");
        Thread myThread3 = new Thread(test3, "myThread3");

        long timeStart = System.currentTimeMillis();

        myThread1.start();
        myThread2.start();
        myThread3.start();
        try {
            myThread1.join();
            myThread2.join();
            myThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long finalTime = System.currentTimeMillis() - timeStart;

        ArrayList<String> answer = new ArrayList<>();

        answer.add("\nМногопоточность: ");
        answer.add(one.get());
        answer.add(two.get());
        answer.add(three.get());
        answer.add("Общее время: " + String.valueOf(finalTime));

        return answer;
    }

    public ArrayList<String> singleThread() {

        ArrayList<String> list = new ArrayList<>();
        list.add("\nПодряд: ");
        long time = System.currentTimeMillis();
        getArray10();
        list.add("Первый поток: " + (System.currentTimeMillis() - time));
        long time2 = System.currentTimeMillis();
        getArray100();
        list.add("Второй поток: " + (System.currentTimeMillis() - time2));
        long time3 = System.currentTimeMillis();
        getArray1000();
        list.add("Третий поток: " + (System.currentTimeMillis() - time3));

        list.add("Общее время: " + (System.currentTimeMillis() - time));

        return list;
    }

}



