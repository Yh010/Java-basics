package com.yash.learning.game;

public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("down");
    }

    public void left() {
        System.out.println("go back");
    }

    public void right() {
        System.out.println("accelerate");
    }
}
