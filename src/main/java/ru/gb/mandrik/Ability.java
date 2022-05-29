package ru.gb.mandrik;

public interface Ability {
    boolean run(RunningTrack r);

    boolean jump(Wall w);
}
