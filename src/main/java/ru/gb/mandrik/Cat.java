package ru.gb.mandrik;

public class Cat implements Ability {
    @Override
    public boolean run(RunningTrack r) {
        System.out.println("Кот бежит...");
        if (r.length <= 1 & r.length > 0) {
            r.positive();
            return true;
        } else if (r.length > 1) {
            r.negative();
            return false;
        } else {
            System.out.println("Неправильно введена длина дорожки!!!");
            return false;
        }
    }

    @Override
    public boolean jump(Wall w) {
        System.out.println("Кот прыгает...");
        if (w.length <= 2 & w.length > 0) {
            w.positive();
            return true;
        } else if (w.length > 2) {
            w.negative();
            return false;
        } else {
            System.out.println("Неправильно введена высота стены!!!");
            return false;
        }
    }
}
