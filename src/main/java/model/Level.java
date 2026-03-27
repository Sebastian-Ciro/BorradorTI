package model;

public class Level {

    private int levelNumber;
    private String levelName;
    private String jsonFilePath;
    private int totalBoxes;
    private int totalTargets;

    public Level(String jsonFilePath, String levelName, int levelNumber, int totalBoxes, int totalTargets) {
        this.jsonFilePath = jsonFilePath;
        this.levelName = levelName;
        this.levelNumber = levelNumber;
        this.totalBoxes = totalBoxes;
        this.totalTargets = totalTargets;
    }

    public String getJsonFilePath() {
        return jsonFilePath;
    }

    public String getLevelName() {
        return levelName;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public int getTotalBoxes() {
        return totalBoxes;
    }

    public int getTotalTargets() {
        return totalTargets;
    }

    public Board getBoard(){
        return null;
    }
    public void setBoard(){

    }
}
