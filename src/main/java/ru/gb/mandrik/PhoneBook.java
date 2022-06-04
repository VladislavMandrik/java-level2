package ru.gb.mandrik;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String s, String n) {
        if (!phoneBook.containsKey(s)) {
            ArrayList<String> a = new ArrayList<>();
            a.add(n);
            phoneBook.put(s, a);
        } else {
            ArrayList<String> a = phoneBook.get(s);
            a.add(n);
        }
    }

    public void get(String s) {
        System.out.println(phoneBook.get(s));
    }
}

