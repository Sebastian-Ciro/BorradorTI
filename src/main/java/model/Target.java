package org.model;

public class Target extends GameObject{
    private boolean occupied;

    public Target(int column, int row, String symbol) {
        super(column, row, symbol);
    }

    public boolean isOccupied() {
        return occupied;
    }
}
