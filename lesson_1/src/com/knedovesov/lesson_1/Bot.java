package com.knedovesov.lesson_1;

public class Bot implements Members {
    private int maxLength;
    private int maxJump;
    private String name;
    private boolean checkWin = true;

    public Bot(String name, int maxLength, int maxJump) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxJump = maxJump;
    }


    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getCheckWin() {
        return checkWin;
    }

    @Override
    public void checkWin(boolean checkWin) {
        this.checkWin = checkWin;
    }
}
