package com.example.lldtictactoe.models;

public class Cell {
    private Player player ;
    private int row;
    private int col;
    private CellState cellState ;
    public Cell(int row , int col ){
        this.row = row;
        this.col = col;
        this.cellState =CellState.EMPTY;
    }
    public Player getplayer(){

        return this.player ;
    }
    public void setPlayer(Player player){
        this.player = player;

    }
    public int getRow(){

        return row;
    }

    public CellState getCellState() {

        return cellState ;
    }

    public void setCellState(CellState cellState) {
    }

    public int getCol() {
        return col;
    }
}
