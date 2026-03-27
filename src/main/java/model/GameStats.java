package model;

public class GameStats {
    private int moves;
    private int pushes;
    private int timeSeconds;
    private int levelId;
    private String username;

    public int getLevelId() {
        return levelId;
    }

    public int getMoves() {
        return moves;
    }

    public int getPushes() {
        return pushes;
    }

    public int getTimeSeconds() {
        return timeSeconds;
    }
}
