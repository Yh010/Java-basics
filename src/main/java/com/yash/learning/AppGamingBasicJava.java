package com.yash.learning;

import com.yash.learning.game.GameRunner;
import com.yash.learning.game.MarioGame;
import com.yash.learning.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
