package model;

public class Game {

    private int currentLevel;
    private GameStatus gameStatus;
    private Board board;
    private Player player;
    private GameStats score;
    private long startTime;

    public Game(Board board, int currentLevel, GameStatus gameStatus, Player player, GameStats score, long startTime) {
        this.board = board;
        this.currentLevel = currentLevel;
        this.gameStatus = gameStatus;
        this.player = player;
        this.score = score;
        this.startTime = startTime;
    }

    public boolean start(){
        return false;
    }

    public boolean reset(){
        return false;
    }

    public boolean canMove(int row, int col){
        return false;
    }

    public boolean canPushBox(int row, int col, Direction d){
        return false;
    }

    public GameState captureState(){
        return null ;
    }

    public void startTimer(){

    }

    public long getElapsedTime(){
        return startTime;
    }

    public boolean processMove(Direction direction){
        return false;
    }

    public boolean checkVictory(){
        return false;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Board getBoard() {
        return board;
    }

    public Player getPlayer() {
        return player;
    }

    public GameStats getScore() {
        return score;
    }

    public boolean undo(){
        return false;
    }

    public boolean saveState(){
        return false;
    }

    public boolean loadState(){
        return false;
    }
}
