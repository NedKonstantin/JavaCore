package com.knedovesov.lesson_1;

import java.util.Random;

public class Track implements Barrier {
    private int length;


    public Track() {
        setLength();
    }

    public void setLength() {
        final Random random = new Random();
        this.length = random.nextInt(1100);
    }

    @Override
    public boolean checkOvercome(Members members) {
        return members.getMaxLength() >= length;
    }
}
