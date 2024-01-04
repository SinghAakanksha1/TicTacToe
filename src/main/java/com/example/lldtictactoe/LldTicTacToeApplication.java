package com.example.lldtictactoe;

import com.example.lldtictactoe.controllers.GameController;
import com.example.lldtictactoe.models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.example.lldtictactoe.models.PlayerType.HUMAN;


public class LldTicTacToeApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameController gameController = new GameController();
        System.out.println("what should be the dimension of the game?");
        int dimension = sc.nextInt();
        System.out.println("Will there be any bot in the game?y/n");
        String isBot = sc.next();
        int numberOfPlayers =dimension-1;
        int numberOfHumanPlayers = numberOfPlayers;
        List<Player> players = new ArrayList<>();
        if(isBot.charAt(0)=='y'){
            numberOfHumanPlayers-=1;
            System.out.println("Enter the name of Bot");
            String botName = sc.next();
            System.out.println("Enter the symbol of the bot");
            String symbol= sc.next();
            players.add(new Bot(botName , symbol.charAt(0) , PlayerType.BOT, BotDifficultyLevel.EASY));
        }

        for(int i=0 ;i<numberOfHumanPlayers ; i++){
            System.out.println("Enter the name of the player");
            String name = sc.next();
            System.out.println("Enter the player symbol ");
            String symbol = sc.next();
            players.add(new Player(name , symbol.charAt(0) , PlayerType.HUMAN));
        }



        Game game = gameController.createGame(dimension , players);

        //start playing
        while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)){
            //while the game status is in progress , keep playing the game
            //display the board to current player to make the move
            System.out.println("this is the current board");
            gameController.displayBoard(game);
            System.out.println("Do you want to undo ? y/n");
            String isUndo =sc.next();
            if(isUndo.charAt(0)=='y'){
                gameController.undo(game);
            }
            else{
                gameController.executeNextMove(game);
            }

        }
        //someone has won the game or game is Draw
        if(gameController.getGameStatus(game).equals(GameStatus.ENDED)){
            //someone has won the game
            System.out.println("Winner is"+gameController.getWinner(game).getName());
        }
        else {
            if (gameController.getGameStatus(game).equals(GameStatus.DRAW)) {
                System.out.println("Game Draw");
            }
        }


    }
}
