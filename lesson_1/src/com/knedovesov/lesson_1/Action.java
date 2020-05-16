package com.knedovesov.lesson_1;

public interface Action {
    boolean run(RunTrack runTrack);
    boolean jump(Wall wall);
}
