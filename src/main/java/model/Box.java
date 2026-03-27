package model;

public class Box extends GameObject implements Movable{
    private boolean onTarget;


    public Box(int column, int row, String symbol) {
        super(column, row, symbol);
    }


    public boolean isOnTarget() {
        return onTarget;
    }

    public void setOnTarget(boolean onTarget) {
        this.onTarget = onTarget;
    }

    @Override
    public void move(Direction direction) {

    }
}
