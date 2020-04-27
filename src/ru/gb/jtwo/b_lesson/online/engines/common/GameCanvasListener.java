package ru.gb.jtwo.b_lesson.online.engines.common;

import java.awt.*;

public interface GameCanvasListener {
    void onCanvasRepainted(GameCanvas canvas, Graphics g, float deltaTime);
}
