package com.example.lldtictactoe.models;

import com.example.lldtictactoe.exceptions.InvalidDimensionException;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players ;
    private List<Move> move;
    private GameStatus gameStatus;
    private int nextPlayerIndex;
    private Player winner;

    public Game(Board board, List<Player> players, List<Move> move, GameStatus gameStatus, int nextPlayerIndex, Player winner) {
        this.board = board;
        this.players = players;
        this.move = move;
        this.gameStatus = gameStatus;
        this.nextPlayerIndex = nextPlayerIndex;
        this.winner = winner;
    }

    private Player getWinner(){
        return winner;
    }
    public Board getBoard(){
        return board;

    }
    public void setBoard(Board board){
        this.board = board;

    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Move> getMove() {
        return move;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setMove(List<Move> move) {
        this.move = move;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public static class GameBuilder{
        private int dimension ;
        private List<Player> players ;

        public int getDimension() {
            return dimension;
        }

        public GameBuilder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;

        }
        private boolean isValid(){
            //game validation will come here
            if(this.dimension<3 ){
                throw new InvalidDimensionException("Dimension can not be less than 3");
                return false;

            }
            if(this.players.size() != dimension-1 ){
                throw new
            }

        }
        public Game build(){
            //validation

        }
//        private List<Move> move;


    }
}
