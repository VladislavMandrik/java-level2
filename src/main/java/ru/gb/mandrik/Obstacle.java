package ru.gb.mandrik;

public class Obstacle {
    int length;

    public void positive() {
        System.out.println("Преодолел успешно!");
    }

    public void negative() {
        System.out.println("Не смог преодолеть!");
    }

    public Obstacle(int length) {
        this.length = length;
    }
}
