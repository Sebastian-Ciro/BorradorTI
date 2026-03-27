package org.model;

public class GameState {

    private  int playerRow;
    private int playerCol;
    private int moveCount;
    private int pushCount;
    private int elapsedTime;
    private int levelNumber;

    public int getElapsedTime() {
        return elapsedTime;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public int getPlayerCol() {
        return playerCol;
    }

    public int getPlayerRow() {
        return playerRow;
    }

    public int getPushCount() {
        return pushCount;
    }
}
