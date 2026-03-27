package model;

public abstract class GameObject {
    private int row;
    private int column;
    private String symbol;

    public GameObject(int column, int row, String symbol) {
        this.column = column;
        this.row = row;
        this.symbol = symbol;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getSymbol() {
        return symbol;
    }

}
