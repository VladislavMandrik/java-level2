package ru.gb.mandrik;

public class Robot implements Ability {
    @Override
    public boolean run(RunningTrack r) {
        System.out.println("Робот бежит...");
        if (r.length <= 200 & r.length > 0) {
            r.positive();
            return true;
        } else if (r.length > 200) {
            r.negative();
            return false;
        } else {
            System.out.println("Неправильно введена длина дорожки!!!");
            return false;
        }
    }

    @Override
    public boolean jump(Wall w) {
        System.out.println("Робот прыгает...");
        if (w.length <= 1 & w.length > 0) {
            w.positive();
            return true;
        } else if (w.length > 1) {
            w.negative();
            return false;
        } else {
            System.out.println("Неправильно введена высота стены!!!");
            return false;
        }
    }
}
