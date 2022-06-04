package ru.gb.mandrik;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        String[] arr = {"Hello", "World", "Car", "Animal", "Cat", "World", "Hello", "Hello", "Put", "Get"};
        List<String> list = Arrays.asList(arr);
        HashSet<String> hashSet = new HashSet<>(list);
        System.out.println("”никальные слова: " + hashSet);
        for (String s : hashSet) {
            System.out.println(s + " встречаетс€ " + Collections.frequency(list, s) + " раз");
        }
    }
}
