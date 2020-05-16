package com.knedovesov.lesson_1;

public class Bot implements Action {
    private static final int MAXRUN = 1000;
    private static final int MAXJUMP = 10;
    protected final String TYPE = "Робот";
    private String name;

    public Bot(String name) {
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
