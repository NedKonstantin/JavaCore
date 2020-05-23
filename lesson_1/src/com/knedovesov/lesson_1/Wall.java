package com.knedovesov.lesson_1;

import java.util.Random;

public class Wall implements Barrier {
    private int height;

    public Wall() {
        setHeight();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight() {
        final Random random = new Random();
        this.height = random.nextInt(50);
    }

    @Override
    public boolean checkOvercome(Members members) {
        return members.getMaxJump() >= height;
    }
}
