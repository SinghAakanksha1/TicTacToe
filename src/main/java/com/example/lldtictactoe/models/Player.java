package com.example.lldtictactoe.models;

import java.util.Scanner;

public class Player {

    private char symbol;
    private String name;
    private PlayerType type;

    public Player(String name , char symbol , PlayerType playerType){
        this.name = name ;
        this.symbol = symbol ;
        this.type = playerType;

    }
    public char getSymbol() {
        return symbol;
    }
    public void setSymbol (char symbol){
        this.symbol = symbol;
    }
    public String getName(){
        return name;
    }
    public void setname (String name ){
        this.name = name ;
    }

    public Move decideMove(Board board) {
        //get the input from the user where to make the next move
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.getName()+"'s turn , please give the row");
        int row = scanner.nextInt();
        System.out.println(this.getName()+"'s turn , please give the column");
        int col = scanner.nextInt();
        return new Move(this , new Cell(row , col));

    }
}
