package ru.gb.mandrik;

public class Main {
    public static void main(String[] args) {
        Ability[] abilities = {
                new Human(),
                new Cat(),
                new Robot()
        };

        Obstacle[] obstacles = {
                new RunningTrack(1000),
                new Wall(2)
        };

        for (Ability ability : abilities) {
            if (!ability.run((RunningTrack) obstacles[0])) {
                continue;
            }
            ability.jump((Wall) obstacles[1]);
        }
    }
}

