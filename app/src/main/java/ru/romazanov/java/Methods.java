package ru.romazanov.java;

import android.text.BoringLayout;

import java.io.*;

public class Methods {

    public static Boolean one(String a, String b) {

        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        return sum >= 10 && sum <= 20;

    }

    public static String two(String a) {
        int num = Integer.parseInt(a);

        if (num >= 0) {
            return "Положительное";
        } else {
            return "Отрицательное";
        }
    }

    public static Boolean three(String a) {
        int num = Integer.parseInt(a);
        if (num >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static String four(String str, String a) {
        int num = Integer.parseInt(a);
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < num; i++) {
            newStr.append(str).append("\n");
        }
        return newStr.toString();
    }

    public static Boolean five(String year) {
        int yearInt = Integer.parseInt(year);
        if (yearInt%4 == 0) {
            if (yearInt%100 == 0) {
                return yearInt % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
