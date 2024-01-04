package com.example.lldtictactoe.strategies.gamewinningstrategy;

import com.example.lldtictactoe.models.Board;
import com.example.lldtictactoe.models.Cell;
import com.example.lldtictactoe.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board , Player player , Cell moveCell);


}
