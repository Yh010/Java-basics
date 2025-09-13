package com.yash.learning.game;

public class GameRunner {
    private MarioGame game; // GameRunner class is tighly coupled to mariogame here. if we want to change
                            // the game, we need to change this line as well

    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
