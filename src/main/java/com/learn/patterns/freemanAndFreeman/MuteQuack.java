package com.learn.patterns.freemanAndFreeman;

/**
 * Created by dmitry on 7/17/14.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("silence");
    }
}
