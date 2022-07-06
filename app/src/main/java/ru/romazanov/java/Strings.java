package ru.romazanov.java;

public class Strings {
    public static String str() {

        String str = "Создание";
        String newStr = str + "Концентрация" + " " + "String";

        int num = 1;
        String newNum = str + num; //Концентрация разных типов

        String strNum = "2";
        String newStr2 = strNum + num;


        String str2 = "Пример с \"символами\"";
        // \n , \r, \t, \b, \f

        String str3 = "Пример \n с \r символами";

        return str3;
    }

    public static void  stringBufferAndStringBuilder() {

        StringBuffer str = new StringBuffer(); // Пустая строка, являеться изменяемой в отличие от String
        StringBuffer str2 = new StringBuffer("Ок");

        str.append("Добавление")
                .append(2)
                .append('2')
                .append(false);

        // Есть еще куча методов :)
        // посмотрел, знаю :)

        StringBuilder str3 = new StringBuilder();
        String newStr = "14124";
        StringBuilder str4 = new StringBuilder(newStr);

        // Тоже самое что и StringBuffer но потоко не безопасен,
        // Работает быстрее StringBuffer

        // Обма метода применяються если нужно много изменять строку, не оставлют за собой "мусор".
    }

}
