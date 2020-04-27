package ru.gb.jtwo.b_lesson.online;

public interface Human extends Animal {
    default void walk() {
        System.out.println("on legs");
    }
    void think();
}
