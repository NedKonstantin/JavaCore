package com.knedovesov.lesson_1;

import java.util.Random;

public class RunTrack {
    private int length;
    private final Random random = new Random();

    public RunTrack() {
        setLength();
    }

    public int getLength() {
        return length;
    }

    public void setLength() {
        this.length = random.nextInt(1100);
    }
}
