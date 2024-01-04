package com.example.lldtictactoe.controllers;

import com.example.lldtictactoe.models.Game;
import com.example.lldtictactoe.models.GameStatus;
import com.example.lldtictactoe.models.Player;

import java.util.List;

public class GameController {
// gamecontroller will have all the methods that a client would need to interact with game
    public void undo(Game game){

    }
    public Game createGame(int dimension , List<Player> players) {
        try {
            Game game = Game.getBuilder().setDimension(dimension).setPlayers(players).build();
            return game;

        }
        catch(Exception e){

            return null;

        }

    }

    public Player getWinner(Game game){

        return game.getWinner();
    }
    public void displayBoard(Game game){
        //print the board
        game.displayBoard();


    }
    public void executeNextMove(Game game){
        game.makeNextMove();
    }
    public GameStatus getGameStatus(Game game){

        return game.getGameStatus();
    }

}
