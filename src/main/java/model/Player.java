package model;

public class Player extends GameObject implements Movable{
    private int moveCount;
    private int pushCount;

    public Player(int column, int row, String symbol, int moveCount, int pushCount) {
        super(column, row, symbol);
        this.moveCount = moveCount;
        this.pushCount = pushCount;
    }


    public int getPushCount() {
        return pushCount;
    }

    public int getMoveCount() {
        return moveCount;
    }

    private void incrementMove(){

    }

    private void incrementPushCount(){

    }

    @Override
    public void move(Direction direction) {

    }
}
