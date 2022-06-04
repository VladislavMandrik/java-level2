package ru.gb.mandrik;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "+31613553135");
        phoneBook.add("Ivanov", "+216513156");
        phoneBook.add("Petrov", "+6768435156");
        phoneBook.get("Ivanov");
        phoneBook.get("Petrov");
    }
}
