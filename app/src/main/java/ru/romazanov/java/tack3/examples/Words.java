package ru.romazanov.java.tack3.examples;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Words {
    String[] array = {"Бурнус",
            "Вознамериться",
            "Наскакать",
            "Проезжать ",
            "Россыпью",
            "Бурнус",
            "Вознамериться",
            "Наскакать",
            "Наскакать",
            "Проезжать ",
            "Россыпью",
            "Бурнус",
            "Проезжать ",
            "Россыпью",
            "Бурнус",
            "Вознамериться",
            "Наскакать",
            "Наскакать",
            "Бурнус",
            "Вознамериться",
            "Наскакать",
            "Проезжать ",
            "Россыпью",
            "Бурнус",
            "Вознамериться"};


    // Нашел уникальные слова.
    HashSet hashSet = new HashSet(List.of(array));

    // Распечатал все уникальные слова
    public void printAllUniqueWord() {
        for (Object word : hashSet) {
            System.out.println(word);
        }
    }


    // Посчитал сколько раз встречается каждое слово.
    public void countWords() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String word: array) {
            if(!hashMap.containsKey(word)) {
                hashMap.put(word, 1);
            } else {
                hashMap.replace(word, hashMap.get(word) + 1);
            }
        }
        for (Map.Entry<String, Integer> word: hashMap.entrySet()) {
            System.out.println("Слово: " + word.getKey() + " встречается: " + word.getValue()+ "раз.");
        }
    }
}
