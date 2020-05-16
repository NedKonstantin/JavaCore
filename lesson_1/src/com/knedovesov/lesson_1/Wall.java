package com.knedovesov.lesson_1;

import java.util.Random;

public class Wall {
    private int height;
    private final Random random = new Random();

    public Wall() {
        setHeight();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = random.nextInt(50);
    }
}
