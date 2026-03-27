package org.model;
import java.util.ArrayList;

public class Board {
    private int rows;
    private int columns;
    private String grid;
    private ArrayList<Cell> cells;

    public Board(int columns, String grid, int rows) {
        this.columns = columns;
        this.grid = grid;
        this.rows = rows;
    }

    public GameObject getCell(int row, int column ){
        return null ;
    }

    public void setCell(int row, int column, GameObject object){

    }

    public boolean isWalkable(int row, int column ){
        return false ;
    }

    public boolean isVictory(){
        return false ;
    }

    public void reset(){

    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public void initializedGrid(){

    }

    public void placeWall(int row, int column){

    }

    public void placeBox(int row, int column){

    }

    public void placeTarget(int row, int column){

    }

    public void placePlayer(int row, int column){

    }

    public void updateCell(int row, int column, CellType type){

    }

    public boolean isWithinBounds(int row, int col){
        return false;
    }
}
