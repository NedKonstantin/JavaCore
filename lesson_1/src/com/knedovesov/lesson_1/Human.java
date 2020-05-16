package com.knedovesov.lesson_1;

public class Human implements Action {
    protected final String TYPE = "Человек";
    private String name;
    private static final int MAXRUN = 300;
    private static final int MAXJUMP = 1;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public boolean run(RunTrack runTrack) {
       return runTrack.getLength() <= MAXRUN;
    }

    @Override
    public boolean jump(Wall wall) {
        return wall.getHeight() <= MAXJUMP;
    }
}
