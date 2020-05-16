package com.knedovesov.lesson_1;

public class Cat implements Action {
    private static final int MAXRUN = 120;
    private static final int MAXJUMP = 2;
    protected final String TYPE = "Кот";
    private String name;

    public Cat(String name) {
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
