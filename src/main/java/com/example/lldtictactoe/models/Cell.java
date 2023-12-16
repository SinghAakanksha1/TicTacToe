package com.example.lldtictactoe.models;

public class Cell {
    private Player player ;
    private int row;
    private int col;
    private CellState cellState ;
    public Cell(int row , int col ){
        this.row = row;
        this.col = col;
    }
    public Player getplayer(){
        return player ;

    }
    public void setPlayer(Player player){
        this.player = player;

    }
    public int getRow(){
        return row;
    }
}
