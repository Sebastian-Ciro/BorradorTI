package model;

public class Cell {
    private int row;
    private int col;
    private CellType type;

    public Cell(int col, int row, CellType type) {
        this.col = col;
        this.row = row;
        this.type = type;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public CellType getType() {
        return type;
    }

    public void setType(CellType type) {
        this.type = type;
    }

    public boolean isEmpty(){
        return false;
    }

    public boolean isBoxOnTarget(){
        return false;
    }
}
