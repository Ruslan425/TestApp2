package ru.romazanov.java.task1;

public class Arrays {

    public static String array() {
        int[] arr = {1,2,3,4,5};
        int[][] arr2 = {{1,2,3},{1,2,3}};
        int[][][] arr3 = {{{1,2,3}, {1,2,3}},{{1,2,3}, {1,2,3}}};

        int[][] arr4 = new int [2][2]; // Регулярный
        int[][][] arr5 = new int [2][][]; // Нерегулярный

       return String.valueOf(arr3[0][1][1]);

    }

}
