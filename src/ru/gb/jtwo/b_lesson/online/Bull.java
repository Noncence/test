package ru.gb.jtwo.b_lesson.online;

public interface Bull extends Animal {
    void voice();
    default void walk() {
        System.out.println("on hooves");
    }
}
